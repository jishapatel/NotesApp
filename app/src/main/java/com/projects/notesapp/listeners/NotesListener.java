package com.projects.notesapp.listeners;


import com.projects.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
