package Ricci;
import java.util.*;
public class Battello {
    Scanner s1 = new Scanner(System.in);
    int postiCoperti, postiScoperti, motori, cavalli;
    String nome, partenza, arrivo;
    public Battello(){}
    public Battello(int postiCoperti, int postiScoperti, int motori, int cavalli, String nome, String partenza, String arrivo){
        this.postiCoperti = postiCoperti;
        this.postiScoperti = postiScoperti;
        this.motori = motori;
        this.cavalli = cavalli;
        this.nome = nome;
        this.partenza = partenza;
        this.arrivo = arrivo;
    }

    public int getPostiCoperti() {
        return postiCoperti;
    }

    public void setPostiCoperti(int postiCoperti) {
        this.postiCoperti = postiCoperti;
    }

    public int getPostiScoperti() {
        return postiScoperti;
    }

    public void setPostiScoperti(int postiScoperti) {
        this.postiScoperti = postiScoperti;
    }

    public int getMotori() {
        return motori;
    }

    public void setMotori(int motori) {
        this.motori = motori;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public String toString() {
        return "il battello: " + this.nome + ", ha: " + this.postiCoperti + " posti coperti, " + this.postiScoperti + " posti scoperti, " + this.motori + " motori, che generano : " + this.cavalli + " e fa la tratta: " + this.partenza + "-" + this.arrivo;
    }
    public Battello aggiungiBattello(){
        Battello b1 = new Battello();
        System.out.println("inserire i posti al coperto: ");
        int postiCoperti = s1.nextInt();
        b1.setPostiCoperti(postiCoperti);

        System.out.println("inserire i posti allo scoperto: ");
        int postiScoperti = s1.nextInt();
        b1.setPostiScoperti(postiScoperti);

        System.out.println("inserire il numero dei motori: ");
        int motori = s1.nextInt();
        b1.setMotori(motori);

        System.out.println("inserire il numero dei cavalli: ");
        int cavalli = s1.nextInt();
        b1.setCavalli(cavalli);

        System.out.println("inserire il nome: ");
        String nome = s1.next();
        b1.setNome(nome);

        System.out.println("inserire la partenza: ");
        String partenza = s1.next();
        b1.setPartenza(partenza);

        System.out.println("inserire l'arrivo: ");
        String arrivo = s1.next();
        b1.setArrivo(arrivo);
        return b1;
    }
}
