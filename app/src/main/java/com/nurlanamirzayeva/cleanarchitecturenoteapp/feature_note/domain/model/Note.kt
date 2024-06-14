package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.model

import android.os.Message
import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nurlanamirzayeva.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.nurlanamirzayeva.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.nurlanamirzayeva.cleanarchitecturenoteapp.ui.theme.RedPink
import com.nurlanamirzayeva.cleanarchitecturenoteapp.ui.theme.Violet

@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id:Int?=null
){

    companion object{

        val noteColors= listOf(RedOrange, Color.LightGray, Violet, BabyBlue, RedPink)
    }

}

class InvalidNoteException(message: String):Exception(message)
