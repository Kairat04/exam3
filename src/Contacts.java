import java.math.BigDecimal;
import java.time.LocalDate;

public class Contacts extends AbstractNote{
    private String phoneNumber;
    private String nameContact;
    private NoteType noteType;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    @Override
    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }




    public Contacts(String text, LocalDate Date, NoteType noteType) {
        super(text,Date, noteType);
    }
}
