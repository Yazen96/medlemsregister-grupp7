import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();
        boolean forsatt = true;

        while (forsatt) {
            System.out.println("Välkommen till medlemsregistret!");
            System.out.println("1. Registrera medlem");
            System.out.println("2. Visa alla medlemmar");
            System.out.println("3. Sök medlem");
            System.out.println("4. Avsluta");
            System.out.print("Välj ett alternativ: ");
            String val = scanner.nextLine(); // Läs in användarens val

            switch (val) {
                case "1":
                    System.out.print("Ange namn: ");
                    String namn = scanner.nextLine().trim();

                    if (namn.isEmpty()) {
                        System.out.println("Namnet får inte vara tomt.");
                        break;
                    }

                    System.out.print("Ange medlemsnummer: ");

                    try {
                        int medlemsnummer = Integer.parseInt(scanner.nextLine().trim());

                        if (medlemsnummer <= 0) {
                            System.out.println("Medlemsnumret måste vara större än 0.");
                            break;
                        }

                        Medlem medlem = new Medlem(namn, medlemsnummer);

                        if (register.laggTillMedlem(medlem)) {
                            System.out.println("Medlemmen har registrerats.");
                        } else {
                            System.out.println("Medlemsnumret finns redan.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Medlemsnumret måste vara ett heltal.");
                    }
                    break;
                case "2":
                    register.visaAllaMedlemmar();
                    break;
                case "3":
                    System.out.print("Ange namn att söka efter: ");
                    String sokNamn = scanner.nextLine().trim();

                    Medlem hittad = register.sokMedlem(sokNamn);

                    if (hittad != null) {
                        System.out.println("Namn: " + hittad.getNamn()
                                + ", Medlemsnummer: " + hittad.getMedlemsnummer());
                    } else {
                        System.out.println("Medlemmen hittades inte.");
                    }
                    break;
                case "4":
                    forsatt = false;
                    System.out.println("Avslutar appen.");
                    // Logik för att avsluta appen
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
                    // Hantera ogiltigt val
            }
        }
        scanner.close();
    }

}