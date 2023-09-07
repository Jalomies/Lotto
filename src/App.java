import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random arpoja = new Random();
        int [] arvotutLuvut = new int [7];
        int arvottuLuku = 0;


        for (int i= 0; i < arvotutLuvut.length; i++) {
            arvottuLuku = arpoja.nextInt(1,36);
            arvotutLuvut[i] = arvottuLuku;
        }

         for (int i= 0; i < arvotutLuvut.length; i++) {
            System.out.println(arvotutLuvut[i]);
        }
    }


 }