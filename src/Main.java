//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro<String> libro_1 = new Libro<>("123jd","Il mondo al contrario","Vannacci" );
        Libro<Integer> libro_2 = new Libro<>(10001, "1984", "George Orwell");
        Libro<String> libro_3 = new Libro<>("ABC987", "Il nome della rosa", "Umberto Eco");
        Libro<Integer> libro_4 = new Libro<>(20042, "Il piccolo principe", "Antoine de Saint-Exupéry");
        Libro<String> libro_5 = new Libro<>("XYZ001", "Fahrenheit 451", "Ray Bradbury");

        Biblioteca biblioteca_1 = new Biblioteca();

        biblioteca_1.aggiungiLibro(libro_1);
        //biblioteca_1.rimuoviLibro("123jd");

        biblioteca_1.registraUtente("federico");

        biblioteca_1.prestaLibro("mario", libro_1);
        biblioteca_1.prestaLibro("federico", libro_1);

        biblioteca_1.restauraLibro("federico");






    }

}