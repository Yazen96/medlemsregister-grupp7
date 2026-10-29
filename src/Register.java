
import java.util.ArrayList;

public class Register {

    private ArrayList<Medlem> medlemmar;

    public Register() {
        medlemmar = new ArrayList<>();
    }

    // Lägger till en medlem
    public boolean laggTillMedlem(Medlem medlem) {
        if (medlem == null) {
            return false;
        }

        // Kontrollerar om medlemsnumret redan finns
        for (Medlem befintlig : medlemmar) {
            if (befintlig.getMedlemsnummer()
                    == medlem.getMedlemsnummer()) {
                return false;
            }
        }

        medlemmar.add(medlem);
        return true;
    }

    // Visar alla medlemmar
    public void visaAllaMedlemmar() {
        if (medlemmar.isEmpty()) {
            System.out.println(
                    "Det finns inga medlemmar i registret."
            );
            return;
        }

        System.out.println("\n--- Medlemsregister ---");

        for (Medlem medlem : medlemmar) {
            System.out.println(
                    "Namn: " + medlem.getNamn()
                            + ", Medlemsnummer: "
                            + medlem.getMedlemsnummer()
            );
        }
    }

    // Söker efter en medlem med medlemsnummer
    public Medlem sokMedlem(int medlemsnummer) {
        for (Medlem medlem : medlemmar) {
            if (medlem.getMedlemsnummer() == medlemsnummer) {
                return medlem;
            }
        }

        return null;
    }
}
