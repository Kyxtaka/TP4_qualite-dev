public class User {
    
    private String name;
    private Cours unCours;

    public User(String name, Cours unCours){
        this.name = name;
        this.unCours = unCours;
    }

    public Cours creerCours(Horaire date, Matiere matiere){
        return new Cours(date,matiere);
    }

    public String getName() {
        return this.name;
    }

    public Cours getUnCours() {
        return this.unCours;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setUnCours(Cours unCours) {
        this.unCours = unCours;
    }

}
