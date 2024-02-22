public class Note {
    private String nomControle;
    private Etudiant etudiant;
    private Matiere matiere;
    private double note;
    
    public Note(String nomControle, Etudiant etudiant, Matiere matiere, double note) {
        this.nomControle = nomControle;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.note note;
    }
    public Note(String nomControle, Etudiant etudiant, Matiere matiere) {
        this.nomControle = nomControle;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.note = 0.00;
    }

    public String getNomControle() {
        return this.nomControle;
    }

    public Etudiant getEtudiant() {
        return this.etudiant;
    }
    public Matiere getMatiere() {
        return this.matiere
    }
    public double getNote() {
        return this.note;
    }
} 
//creer les autre classe avant