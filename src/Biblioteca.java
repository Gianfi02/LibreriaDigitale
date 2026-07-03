import java.util.*;

public class Biblioteca {
    private static final List<Libro<?>> libri = new ArrayList<>();
    private static final Set<String> utenti = new HashSet<>();
    private static final Map<String, Stack<Libro<?>>> libri_prestati = new HashMap<>();
    private static final Queue<Libro<?>> restituiti = new LinkedList<>();

    public List<Libro<?>> getLibri(){
        return libri;
    }

    public Queue<Libro<?>> getRestituiti(){
        return restituiti;
    }



    public void aggiungiLibro(Libro<?> libro){
        libri.add(libro);

    }
    public <T> void rimuoviLibro(T id){

        boolean rimosso = libri.removeIf(libro -> libro.getCodice().equals(id));

        if (rimosso){
            System.out.println("Il libro con codice: "+id+" e' stato rimosso.");
        }else{
            System.out.println("Nessun libro con codice: "+id);
        }

    }

    public void registraUtente(String nome){
        if(utenti.add(nome)){
            System.out.println("l'utente: "+nome+" è stato inserito correttamente");
        }else {
            System.out.println("l'utente: "+nome+" è già presente, cambiare nome.");
        }
        libri_prestati.put(nome, new Stack<>());

    }

    public void prestaLibro(String nome, Libro<?> libro){
        if(utenti.contains(nome)){
            libri_prestati.get(nome).push(libro);
            System.out.println("L'utente: "+nome+" ha preso in prestito il libro: "+libro.getCodice());
        }else{
            System.out.println("Nome utente non valido");
        }
    }
    //restituisce l'ultimo libro prestato a nome e lo aggiunge a restituiti
    public void restauraLibro(String nome){
        Libro<?> restituito;
        try{
            restituito = libri_prestati.get(nome).pop();
            restituiti.offer(restituito);
            System.out.println("Libro restaurato con successo");
        }catch (EmptyStackException e){
            System.out.println("L'utente: "+nome+" non ha libri in prestito");
        }

    }
}
