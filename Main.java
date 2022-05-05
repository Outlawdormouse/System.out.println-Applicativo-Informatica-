package Ricci;
import java.util.*;

public class Main {
    public static void main(String[] args){
        boolean fine = false;

        ArrayList <Battello> Flotta = new ArrayList<Battello>();
        ArrayList <Prenotazione> Prenotazioni = new ArrayList<Prenotazione>();

        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("cosa si vuole gestire? \n1 - flotta \n2 - prenotazioni");
            int Scelta = s1.nextInt();

            switch (Scelta){
            case 1:
                System.out.println("Cosa vuoi fare? \n1 - aggiungere un battello \n2 - visualizzare la flotta \n3 - uscire");
                int scelta = s1.nextInt();
                switch(scelta) {
                    case 1:
                        Battello b1 = new Battello();
                        Flotta.add(b1.aggiungiBattello());

                    case 2:
                        System.out.println(Flotta);

                    case 3:
                        fine = true;
                }
            case 2:
                System.out.println("Cosa vuoi fare? \n1 - aggiungere una prenotazione \n2 - visualizzare le prenotazioni \n3 - cancellare una prenotazione \n4 - uscire");
                int Sceltaa = s1.nextInt();
                switch(Sceltaa) {
                    case 1:
                        Prenotazione p1 = new Prenotazione();
                        Prenotazioni.add(p1);

                    case 2:
                        System.out.println(Prenotazioni);

                    case 3:
                        Prenotazione p2 = new Prenotazione();
                        int a = Prenotazioni.indexOf(p2);
                        Prenotazioni.remove(a);
                    case 4:
                        fine = true;
                }
            }
        }while(!fine);
    }
}
