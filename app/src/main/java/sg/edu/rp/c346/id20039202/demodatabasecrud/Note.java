package sg.edu.rp.c346.id20039202.demodatabasecrud;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public int getId() {
        return id;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }
}
