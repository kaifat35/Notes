package com.example.notes.domain

class AddNoteUseCase (
    private val repository: NotesRepository
){

    operator  fun invoke(note: Note){
        repository.addNote(note)
    }
}