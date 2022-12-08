import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String text = "NoteBook";
        Note note1 = new Note("Hello",LocalDate.now(),NoteType.IDEA);
        Note note2 = new Note("Hi",LocalDate.now(),NoteType.IDEA);
        Note note3 = new Note("Sup",LocalDate.now(),NoteType.IDEA);


        Contacts contacts1 = new Contacts("Pasha",LocalDate.now(),NoteType.DUTY);
        Contacts contacts2 = new Contacts("Sasha",LocalDate.now(),NoteType.DUTY);
        Contacts contacts3 = new Contacts("Dasha",LocalDate.now(),NoteType.DUTY);

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\OneDrive\\java\\text\\ex3.txt",true);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
