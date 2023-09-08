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
System.out.println("On uudelleenarvonta: "+samaLuku); 
            arvottuLuku = arpoja.nextInt(1,36);
            arvotutLuvut[i] = arvottuLuku;
System.out.println("ARVOTTU: "+arvottuLuku);
  

             for (int j= 0; j < i; j++) {    
                
                verrattava = arvotutLuvut[j];
System.out.println(verrattava+"V");
                tarkistus = arvottuLuku;
System.out.println(tarkistus+"T");              


                if (tarkistus == verrattava) {
System.out.println("SAMA! "+tarkistus+" LUKU ARVO UUDESTAAN!");
                    samaLuku = true;
                    break;
                } else {
                    samaLuku = false;
                }
            }
            if (samaLuku == true) {
                i = i -1;
                continue;
            } else
                System.out.println("LISÄTTY LISTAAN: " + arvotutLuvut[i]);
            
        }
        System.out.println("Arvotut numerot ovat: ");
        for (int i = 0; i < arvotutLuvut.length; i++) {
            System.out.print(arvotutLuvut[i]+" ");

        }

    }


 }