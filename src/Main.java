public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat = new Kwadrat(16.78);
        Prostokąt prostokąt = new Prostokąt(12.32, 7.2);

        System.out.println("Pole kwadratu: " + kwadrat.pole());
        System.out.println("Obwód kwadratu: " + kwadrat.obwód());

        System.out.println("Pole prostokąta: " + prostokąt.pole());
        System.out.println("Obwód prostokąta: " + prostokąt.obwód());
    }
}
