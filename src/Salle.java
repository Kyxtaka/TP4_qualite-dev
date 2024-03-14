public class Salle {
    private String name;
    private Horaire uneHoraire;


    public Salle(String name, Horaire uneHoraire){
        this.name = name;
        this.uneHoraire = uneHoraire;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Horaire getUneHoraire() {
        return this.uneHoraire;
    }

    public void setUneHoraire(Horaire uneHoraire) {
        this.uneHoraire = uneHoraire;
    }
}
