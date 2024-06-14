package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrderType
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(private val repository: NoteRepository) {

    operator fun invoke(
        noteOrder: NoteOrderType = NoteOrderType.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrderType.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrderType.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrderType.Color -> notes.sortedBy { it.color }

                    }
                }

                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrderType.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrderType.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrderType.Color -> notes.sortedByDescending { it.color }

                    }
                }
            }
        }

    }
}