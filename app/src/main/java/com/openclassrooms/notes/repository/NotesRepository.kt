package com.openclassrooms.notes.repository

import com.openclassrooms.notes.model.NoteModel
import com.openclassrooms.notes.service.LocalNotesApiService
import com.openclassrooms.notes.service.NotesApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Repository class for the notes.
 */
class NotesRepository {

    /**
     * The API service for interacting with notes.
     */
    var notesApiService: NotesApiService = LocalNotesApiService()

    /**
     * A flow that emits a list of all notes.
     */
    val notes: Flow<List<NoteModel>> = flow {
        emit(notesApiService.getAllNotes())
    }
}