package com.TugasUTSGenap2023AKBIF510120203;

import android.database.Cursor;

import com.TugasUTSGenap2023AKBIF510120203.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

