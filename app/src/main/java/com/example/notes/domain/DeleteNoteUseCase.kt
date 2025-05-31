package com.example.notes.domain

class DeleteNoteUseCase (
    private val repository: NotesRepository
){

    operator fun invoke(noteId: Int){
        repository.deleteNote(noteId)
    }
}