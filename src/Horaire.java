import java.util.ArrayList;
import java.util.List;

public class Horaire {
    private String startDate;
    private String endDate;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;

    public Horaire(String startDate, String endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        this.lesSalles = new ArrayList<>();
        this.lesCours = new ArrayList<>();
    }
    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Salle> getLesSalles() {
        return this.lesSalles;
    }

    public void setLesSalles(List<Salle> lesSalles) {
        this.lesSalles = lesSalles;
    }

    public List<Cours> getLesCours() {
        return this.lesCours;
    }

    public void setLesCours(List<Cours> lesCours) {
        this.lesCours = lesCours;
    }

}
