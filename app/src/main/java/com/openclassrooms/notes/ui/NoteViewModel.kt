package com.openclassrooms.notes.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.openclassrooms.notes.model.NoteModel
import com.openclassrooms.notes.repository.NotesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NoteViewModel (
    private val notesRepository: NotesRepository
):ViewModel() {

    private val _allNotes = MutableStateFlow<List<NoteModel>>(emptyList())
    val allNotes: StateFlow<List<NoteModel>> get() = _allNotes

    /**
     * Collects notes from the repository and updates the adapter.
     */
    fun collectNotes() {
        viewModelScope.launch {
            notesRepository.notes.collect { notes ->
                _allNotes.value = notes
            }
        }
    }
}