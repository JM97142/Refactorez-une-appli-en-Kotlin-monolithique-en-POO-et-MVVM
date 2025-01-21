package com.openclassrooms.notes.service

import com.openclassrooms.notes.model.NoteModel

/**
 * Defines the contract for the API that manages the notes
 */
interface NotesApiService {

    /**
     * Add a note
     * @param note The note to add
     */
    fun addNote(note: NoteModel)

    /**
     * Returns all the notes
     * @return the list of notes
     */
    fun getAllNotes(): List<NoteModel>

}