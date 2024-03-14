import java.util.ArrayList;
import java.util.List;

public class Cours {
    private Horaire uneHoraire;
    private List<User> lesUsers;
    private List<Groupe> lesGroupes;
    private List<Matiere> lesMatieres;

    public Cours(Horaire uneHoraire){
        this.uneHoraire = uneHoraire;
        this.lesUsers = new ArrayList<>();
        this.lesGroupes = new ArrayList<>();
    }

    public void ajouteUser(User unUser){
        this.lesUsers.add(unUser);

    }

    public void ajouteGroupe(Groupe unGroupe){
        this.lesGroupes.add(unGroupe);
        
    }

    public Horaire getUneHoraire() {
        return this.uneHoraire;
    }

    public List<User> getLesUsers() {
        return this.lesUsers;
    }

    public List<Groupe> getLesGroupes() {
        return this.lesGroupes;
    }
    public List<Matiere> getLesMatieres() {
        return this.lesMatieres;
    }
}
