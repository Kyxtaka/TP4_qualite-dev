
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class EtudiantTest {
    @Test
    public void testEtuciantCreate1() {
        Etudiant etu1 = new Etudiant("Nathan","Randriantsoa");
        assertEquals(etu1.getFirstName(), "Nathan");
        assertEquals(etu1.getLastName(), "Randriantsoa");
    }
    @Test
    public void testEtuciantCreate2() {
        Etudiant etu2 = new Etudiant("Joann","Raignault");
        assertEquals(etu2.getFirstName(), "Joann");
        assertEquals(etu2.getLastName(), "Raignault");
    }
    @Test
    public void testEtuciantCreate3() {
        Etudiant etu2 = new Etudiant("Joann","Raignault");
        assertEquals(etu2.getFirstName(), "Joann");
        assertEquals(etu2.getLastName(), "Raignault");
    }
}
