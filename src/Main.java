import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro<String> libro_1 = new Libro<>("123jd","mondo al contrario","Vannacci" );
        Libro<Integer> libro_2 = new Libro<>(10001, "1984", "George Orwell");
        Libro<String> libro_3 = new Libro<>("ABC987", "nome della rosa", "Umberto Eco");
        Libro<Integer> libro_4 = new Libro<>(20042, "piccolo principe", "Antoine de Saint-Exupéry");
        Libro<String> libro_5 = new Libro<>("XYZ001", "Fahrenheit 451", "Ray Bradbury");

        Biblioteca biblioteca_1 = new Biblioteca();

        biblioteca_1.aggiungiLibro(libro_1);
        biblioteca_1.aggiungiLibro(libro_2);
        biblioteca_1.aggiungiLibro(libro_3);
        biblioteca_1.aggiungiLibro(libro_4);
        biblioteca_1.aggiungiLibro(libro_5);
        //biblioteca_1.rimuoviLibro("123jd");

        biblioteca_1.registraUtente("federico");

        //SIMULAZIONE DI PRESTITI E RESTITUZIONI
        biblioteca_1.prestaLibro("mario", libro_1);
        biblioteca_1.prestaLibro("federico", libro_1);

        biblioteca_1.restauraLibro("federico");
        //STAMPA LA LISTA DI LIBRI IN BIBLIOTECA
        for (Libro<?> l : biblioteca_1.getLibri()){
            System.out.println(l.getNome());
        }
        //STAMPA LA LISTA DI LIBRI RESTITUITI IN BIBLIOTECA
        System.out.println("LIBRI RESTITUITI");
        for (Libro<?> l : biblioteca_1.getRestituiti()){
            System.out.println(l.getNome());
        }
        System.out.println("------------------");

        // ORDINAMENTO SENZA CLASSE ANONIMA
//        List<Libro<?>> libri = biblioteca_1.getLibri();
//        libri.sort(Comparator.comparing(Libro::getNome)); // è come scrivere di libro chama libro.getNome, libro -> libro.getNome


        for (Libro<?> l : biblioteca_1.getLibri()){
            System.out.println(l.getNome());
        }
        //ORDINAMENTO PER NOME ALFABETICO TRAMITE CLASSE ANONIMA CON OVERRIDE SU COMPARE
        Collections.sort(biblioteca_1.getLibri(), new Comparator<Libro<?>>() {
            @Override
            public int compare(Libro<?> o1, Libro<?> o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        //STAMPA LA LISTA DI LIBRI IN BIBLIOTECA
        for (Libro<?> l : biblioteca_1.getLibri()){
            System.out.println(l.getNome());
        }



    }

}