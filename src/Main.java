import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                case "1": System.out.println("Registrera medlem");
                    // Logik för att registrera medlem
                    break;
                case "2": System.out.println("Visa alla medlemmar");
                    // Logik för att visa alla medlemmar
                    break;
                case "3": System.out.println("Sök medlem");
                    // Logik för att söka medlem
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