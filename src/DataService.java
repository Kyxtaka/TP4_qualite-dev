import java.util.ArrayList;
import java.util.List;

public class DataService {
    public static DataService instance; 
    public List<Note> listNotes; 
    public List<Etudiant> listEtudiants;

    public static DataService getInstantce() {
        if (instance == null) {
            instance = new DataService();
        }
        return instance;
    }
    private DataService() {
        listEtudiants = new ArrayList<>();
        listNotes = new ArrayList<>();
    }

    public void addEtudiant(Etudiant etudiant) {
        this.listEtudiants.add(etudiant);
    }
    
}
