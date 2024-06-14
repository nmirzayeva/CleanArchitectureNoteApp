package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrderType
import com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrderType = NoteOrderType.Date(OrderType.Descending),
    onOrderChange: (NoteOrderType) -> Unit
) {

    Column(modifier = modifier) {

        Row(modifier = Modifier.fillMaxWidth()) {

            DefaultRadioButton(
                text = "Title",
                selected = noteOrder is NoteOrderType.Title,
                onSelect = { onOrderChange(NoteOrderType.Title(noteOrder.orderType)) }
            )

            Spacer(modifier = Modifier.width(8.dp))

            DefaultRadioButton(
                text = "Date",
                selected = noteOrder is NoteOrderType.Title,
                onSelect = { onOrderChange(NoteOrderType.Date(noteOrder.orderType)) }
            )

            Spacer(modifier = Modifier.width(8.dp))

            DefaultRadioButton(
                text = "Color",
                selected = noteOrder is NoteOrderType.Title,
                onSelect = { onOrderChange(NoteOrderType.Color(noteOrder.orderType)) }
            )

        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier=Modifier.fillMaxWidth()){

            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = { onOrderChange(noteOrder.copy(OrderType.Ascending)) }
            )

            Spacer(modifier = Modifier.width(8.dp))

            DefaultRadioButton(
                text = "Descending",
                selected = noteOrder.orderType is OrderType.Descending,
                onSelect = { onOrderChange(noteOrder.copy(OrderType.Descending)) }
            )
        }
    }

}