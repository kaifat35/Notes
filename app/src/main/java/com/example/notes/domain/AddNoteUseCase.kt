package com.example.notes.domain

class AddNoteUseCase (
    private val repository: NotesRepository
){

    suspend operator  fun invoke(
        title: String,
        content: String
    ){
        repository.addNote(
            title = title,
            content = content,
            isPinned = false,
            updateAt = System.currentTimeMillis()
        )
    }
}