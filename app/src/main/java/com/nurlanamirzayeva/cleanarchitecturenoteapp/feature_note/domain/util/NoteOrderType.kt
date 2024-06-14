package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrderType(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrderType(orderType)
    class Date(orderType: OrderType) : NoteOrderType(orderType)
    class Color(orderType: OrderType) : NoteOrderType(orderType)


    fun copy(orderType: OrderType): NoteOrderType {
        return when (this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color ->Color(orderType)
        }
    }

}