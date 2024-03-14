public enum Matiere {
    PYTHON("PYTHON"),
    JAVA("JAVA"),
    QUALITEDEV("QT"),
    IJVM("IJVM"),
    BD("BD");

    private String matiere;

    private Matiere(String matiere) {
        this.matiere = matiere;
    }
    @Override
    public String toString() {
        return this.matiere;
    }
}
