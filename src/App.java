import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random arpoja = new Random();
        int [] arvotutLuvut = new int [7];
        int arvottuLuku = 0;
        boolean samaLuku = false;
        int tarkistus = 0;
        int verrattava = 0;


        for (int i= 0; i < arvotutLuvut.length; i++) {
            arvottuLuku = arpoja.nextInt(1,36);
            arvotutLuvut[i] = arvottuLuku;

             for (int j= 0; j < i; j++) {

                tarkistus = arvotutLuvut[j];
                verrattava = arvottuLuku;
                if (tarkistus == verrattava) {
                    samaLuku = true;;
                    System.out.println("SAMA! "+tarkistus+" LUKU ARVO UUDESTAAN!");
                }
        
            }
            System.out.println(arvotutLuvut[i]);

        }


    }


 }