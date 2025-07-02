import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente le informazioni
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colorePreferito = scanner.nextLine();

    boolean dataValida = false;
    while (!dataValida) {
        try {
            System.out.print("Inserisci il giorno di nascita (es. 12): ");
        int giorno = scanner.nextInt();

        System.out.print("Inserisci il mese di nascita (es. 5): ");
        int mese = scanner.nextInt();

        System.out.print("Inserisci l'anno di nascita (es. 1994): ");
        int anno = scanner.nextInt();
        
        //creo una data per verificare che sia valida
        LocalDate dataNascita = LocalDate.of(giorno,mese,anno);
        dataValida = true; 
         // Calcola la somma di giorno, mese e anno
        int sommaData = giorno + mese + anno;

          // Genera la password
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;
        } catch (DateTimeException e) {
            System.out.print("Data non valida! Riprovare.");
            scanner.nextLine();
        }
        
    }
}