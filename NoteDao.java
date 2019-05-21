package com.example.inventario;

public interface NoteDao {

    void insert(Note note);

    //El update

    void update(Note note);

    //El delete

    void delete(Note note);

    @Query("DELETE FROM note_table ORDER BY priority  DESC")
    LiveData<List<Note>> getAllNotes();



}
