import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class AbstractNote {
    private String text;
    private LocalDate Date;
    private NoteType noteType;


    public AbstractNote(String text, LocalDate localDate, NoteType noteType) {
        this.text = text;
        this.Date = localDate;
        this.noteType = noteType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getLocalDate() {
        return Date;
    }

    public void setLocalDate(LocalDate localDate) {
        this.Date = localDate;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }
}
