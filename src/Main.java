public class Main {
        public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.setPowierzchnia(200);
        dom1.setAdres("Kowalskiego 21");
        dom1.setkolorDomu(KolorEnum.BIAŁY);
        dom1.setliczbaMieszkańców(10);
        dom1.setLiczbaOkien(5);

        dom2.setAndGetPowierzchnia(150);
        dom2.setAndGetAdres("Nowaka 3");
        dom2.setkolorDomu(KolorEnum.CZEROWNY);
        dom2.setliczbaMieszkańców(3);
        dom2.setAndGetLiczbaOkien(15);

        System.out.println(dom1);
        System.out.println(dom2);

    }
}
