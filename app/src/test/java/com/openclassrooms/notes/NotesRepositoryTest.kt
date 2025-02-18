package com.openclassrooms.notes

import com.openclassrooms.notes.model.NoteModel
import com.openclassrooms.notes.repository.NotesRepository
import com.openclassrooms.notes.service.NotesApiService
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class NotesRepositoryTest {

    @Mock
    lateinit var mockNotesApiService: NotesApiService
    private lateinit var notesRepository: NotesRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)

        notesRepository = NotesRepository().apply {
            notesApiService = mockNotesApiService
        }
    }

    @Test
    fun `test notes flow emits correct data`() = runBlocking {
        // Given
        val mockNotes = listOf(
            NoteModel("Title Test 1", "Body Test 1"),
            NoteModel("Title Test 2", "Body Test 2")
        )
    }
}