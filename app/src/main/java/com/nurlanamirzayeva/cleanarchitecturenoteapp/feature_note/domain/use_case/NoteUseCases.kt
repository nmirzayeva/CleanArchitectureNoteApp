package com.nurlanamirzayeva.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCases(

    val getNotes:GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote:AddNote
)
