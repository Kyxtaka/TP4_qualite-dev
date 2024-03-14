import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String firstName;
    private String lastName;
    private List<Groupe> lesGroupes;
    private List<Note> lesNotes;

    public Etudiant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lesGroupes = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public List<Groupe> getLesGroupes() {
        return this.lesGroupes;
    }
    public List<Note> getLesNotes() {
        return this.lesNotes;
    }
        //Fix
}
