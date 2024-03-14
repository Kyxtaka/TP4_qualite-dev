import java.util.ArrayList;
import java.util.List;

public class Cours {
    private Horaire uneHoraire;
    private List<User> lesUsers;
    private List<Groupe> lesGroupes;
    private Matiere matiere;

    public Cours(Horaire uneHoraire, Matiere matiere){
        this.uneHoraire = uneHoraire;
        this.lesUsers = new ArrayList<>();
        this.lesGroupes = new ArrayList<>();
        this.matiere = matiere;
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
    
    public Matiere getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    public void setUneHoraire(Horaire uneHoraire) {
        this.uneHoraire = uneHoraire;
    }

    public void setLesUsers(List<User> lesUsers) {
        this.lesUsers = lesUsers;
    }

    public void setLesGroupes(List<Groupe> lesGroupes) {
        this.lesGroupes = lesGroupes;
    }
}
