package Ricci;
import java.util.*;

public class Prenotazione {
    Scanner s1 = new Scanner(System.in);
    private String giorno, ora, nome, cognome;
    private int posti;
    public Prenotazione(){}
    public Prenotazione(String giorno, String ora, String nome, String cognome, int posti){
        this.giorno = giorno;
        this.ora = ora;
        this.nome = nome;
        this.cognome = cognome;
        this.posti = posti;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public String toString(){
        return "il signor/ la signora " + this.nome + " " + this.cognome + " ha prenotato per il " + this.giorno + " alle: " + this.ora + " per " + this.posti + " persone";
    }
    public Prenotazione aggiungiPrenotazione(){
        Prenotazione p1 = new Prenotazione();
        System.out.println("inserire il giorno: ");
        String giorno = s1.next();
        p1.setGiorno(giorno);

        System.out.println("inserire l'ora: ");
        String ora = s1.next();
        p1.setOra(ora);

        System.out.println("inserire il nome: ");
        String nome = s1.next();
        p1.setNome(nome);

        System.out.println("inserire il cognome: ");
        String cognome = s1.next();
        p1.setCognome(cognome);

        System.out.println("inserire il numero dei posti: ");
        int posti = s1.nextInt();
        p1.setPosti(posti);
        return p1;
    }

    public Prenotazione rimuoviPrenotazione(){
        Prenotazione p2 = new Prenotazione();
        System.out.println("inserire il giorno: ");
        String Giorno = s1.next();
        p2.setGiorno(Giorno);

        System.out.println("inserire l'ora: ");
        String Ora = s1.next();
        p2.setOra(Ora);

        System.out.println("inserire il nome: ");
        String Nome = s1.next();
        p2.setNome(Nome);

        System.out.println("inserire il cognome: ");
        String Cognome = s1.next();
        p2.setCognome(Cognome);

        System.out.println("inserire il numero dei posti: ");
        int Posti = s1.nextInt();
        p2.setPosti(Posti);
        return p2;
    }
}
