package com.example.notes.domain

import kotlinx.coroutines.flow.Flow

interface NotesRepository {

    fun addNote(note: Note)

    fun deleteNote(noteInt: Int)

    fun editeNote(note: Note)

    fun getAllNotes(): Flow<List<Note>>

    fun getNote (noteInt: Int): Note

    fun searchNotes(queue: String): Flow<List<Note>>

    fun switchPinnedStatus(noteInt: Int)
}