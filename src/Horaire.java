import java.time.LocalDateTime;
import java.time.Month;
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
}
