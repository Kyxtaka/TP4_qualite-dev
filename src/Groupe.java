import java.util.List;
import java.util.ArrayList;

public class Groupe {
    private String nom; 
    private List<Etudiant> listEtudiants;
    private List<Cours> listCours;

    public Groupe() {
        this.listEtudiants = new ArrayList<>();
        this.listCours = new ArrayList<>();
    }
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Etudiant> getEtudiants() {
        return this.listEtudiants;
    }

    public void setEtudiants(List<Etudiant> listEtudiants) {
        this.listEtudiants = listEtudiants;
    }

    public List<Cours> getCours() {
        return this.listCours;
    }

    public void setCours(List<Cours> listCours) {
        this.listCours = listCours;
    }

    public void addEtudiant(Etudiant etudiant) {
        this.listEtudiants.add(etudiant);
    }

    public void removeEtudiant(Etudiant etudiant) {
        this.listEtudiants.remove(etudiant);
    }
    public void addCours(Cours cours) {
        this.listCours.add(cours);
    }
    public void removeCours(Cours cours) {
        this.listCours.remove(cours);
    }
}