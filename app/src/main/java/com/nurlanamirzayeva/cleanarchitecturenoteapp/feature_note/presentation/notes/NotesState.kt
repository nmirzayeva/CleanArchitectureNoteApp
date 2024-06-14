package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrderType
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder:NoteOrderType = NoteOrderType.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean=false
)
