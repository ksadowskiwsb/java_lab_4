import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        boolean isIndexCorrect = false;

        Scanner scan = new Scanner(System.in);

        while(!isIndexCorrect) {
            System.out.println("Podaj indeks tablicy: ");

            try {
                int index = Integer.parseInt(scan.next());

                System.out.println("Element tablicy o indeksie " + index + ": " + arr[index]);

                isIndexCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzony znak nie jest cyfrą.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indeks poza tablicą.");
            } finally {
                if (isIndexCorrect) {
                    return;
                }
            }
        }

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        try {
            String str = null;

            str.toLowerCase(Locale.ROOT);
        } catch (NullPointerException e) {
            System.out.println("Błąd nie można wywołać metody toLowerCase() na null");

            throw e;
        }

        try {
            int a = 1;
            int b = 0;

            int result = a / b;
        } catch (ArithmeticException  e) {
            System.out.println("Nie dziel przez zero.");

            throw e;
        }

        try {
            System.out.println("Podaj 0 element tablicy: ");
            arr[0] = scan.nextInt();

            int result = 1 / arr[0];
        } catch (ArithmeticException  e) {
            System.out.println("Element 0 = 0. Nie dziel przez zero.");

            throw e;
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzony znak nie jest liczbą całkowitą.");

            throw e;
        } finally {
            System.out.println("Koniec zadania.");
        }
    }
}
