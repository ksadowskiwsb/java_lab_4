
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
        */

        Student student1 = new Student("Mariusz", 123456789, 180, 90);
        Student student2 = new Student("Wojtek", 987654321, 168, 62);

        System.out.println(student1);
        System.out.println(student2);

        Pracownik pracownik1 = new Pracownik("Dariusz", 199, 97, 35000, "Koszykarz");
        Pracownik pracownik2 = new Pracownik("Marek", 180, 90, 20000, "Trener");

        System.out.println(pracownik1);
        System.out.println(pracownik2);
    }
}
