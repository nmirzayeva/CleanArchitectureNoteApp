package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrderType

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrderType) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    data object RestoreNote : NotesEvent()
    data object ToggleOrderSection : NotesEvent()
}