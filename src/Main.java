import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* przykład 4. Blok try catch */

        String tab[] = {"Ala", "Ola", "Ela", "Ula"};
        Scanner scan = new Scanner(System.in);
        int index = -1;

        try {
            index = Integer.parseInt(scan.next());
        } catch (Exception n) {
            System.out.println("Błąd, brak informacji jaki to błąd");
        }

        System.out.println("Podaj indeks tablicy [0-3], który ma być wyświetlony: ");

        /* W bloku try sprawdzamy poprawność odebranych znaków z klawiatury */
        try {
            index = Integer.parseInt(scan.next());
            /* block catch przechwytuje błąd, jeśli w tym przypadku znak jest różny od numeru,
             * porównania dokonujemy z typem 'NumberFormatException' */
        } catch (NumberFormatException e) {
            System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
            throw e;
        }

        if (index < 3 && index >= 0) {
            try {
                System.out.println(tab[index]);
                /* sprawdzenie czy przepełniona tablicca 'ArrayIndexOutOfBoundsException' */
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Błąd Podałeś index: " + index + ", a dozwolone są od 0 do " + (tab.length - 1));
            } finally {
                System.out.println("Koniec programu");
            }
        }

        /* Przykład null pointer */
        try {
            String name = null;
            name.toString();
        } catch (NullPointerException e) {
            System.out.println("Błąd nie można wywołać metody toString() na null");
            throw e; // rzuca komunikat z klasy Exception
        }
    }
}
