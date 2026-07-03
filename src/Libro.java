public class Libro<T> {
    private T codice;
    private String nome;
    private String autore;

    public Libro(T codice, String nome, String autore){
        this.codice = codice;
        this.nome = nome;
        this.autore = autore;
    }

    public T getCodice(){
        return codice;
    }
    public String getNome(){
        return nome;
    }
}
