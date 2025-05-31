package com.example.notes.domain

class EditNoteUseCase(
    private val repository: NotesRepository
) {

    operator fun invoke(note: Note){
        repository.editeNote(note)
    }
}