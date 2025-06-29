import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente le informazioni nome, cognome e colore preferito
    
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colorePreferito = scanner.nextLine();

        System.out.print("Inserisci il giorno di nascita (es. 12): ");
        int giorno = scanner.nextInt();

        System.out.print("Inserisci il mese di nascita (es. 5): ");
        int mese = scanner.nextInt();

        System.out.print("Inserisci l'anno di nascita (es. 1994): ");
        int anno = scanner.nextInt();

        // Calcola la somma di giorno, mese e anno
        int sommaData = giorno + mese + anno;

        // Genera la password
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;

        // Stampa la password
        System.out.println("La tua password generata è: " + password);

        scanner.close();
    }
}