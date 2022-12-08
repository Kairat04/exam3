import java.time.LocalDate;

public class Note extends AbstractNote{
     private String header = "My name is Kairat";

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Note(String text, LocalDate localDate, NoteType noteType, String header) {
        super(text, localDate, noteType);
        this.header = header;
    }


    public Note(String text, LocalDate localDate, NoteType noteType) {
        super(text, localDate, noteType);
    }
}
