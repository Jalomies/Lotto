import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random arpoja = new Random();
        int [] arvotutLuvut = new int [7];
        int [] lottoRivi = {1,2,3,4,5,6,7};
        int arvottuLuku = 0;
        boolean samaLuku = false;
        int tarkistus = 0;
        int verrattava = 0;
        int arvattuluku = 0;
        int oikeinMaara = 0;

        for (int i= 0; i < arvotutLuvut.length; i++) { 
            arvottuLuku = arpoja.nextInt(1,36);
            arvotutLuvut[i] = arvottuLuku;
System.out.println("\nARVOTTU: "+arvottuLuku);
  

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
        System.out.println("\nArvottu kierros on: ");
        for (int i = 0; i < arvotutLuvut.length; i++) {
            System.out.print(arvotutLuvut[i]+" ");  
        }
        System.out.println("\n\nLottorivisi on: ");
        for (int i = 0; i < arvotutLuvut.length; i++) {
            System.out.print(lottoRivi[i]+" ");  
        }

        for (int i = 0; i < arvotutLuvut.length; i++) { 
            arvottuLuku = arvotutLuvut[i];
System.out.println("\nArvottu: "+arvottuLuku);            

            for (int j = 0; j <lottoRivi.length; j++) {
                arvattuluku = lottoRivi[j];
System.out.print("Arvattu: "+arvattuluku);                
                if (arvattuluku == arvottuLuku) {
System.out.print(" Oikein!");                    
                oikeinMaara ++;
                 }
                 System.out.println(" ");
            }
        }

        System.out.println("\nSait "+oikeinMaara+" oikein.");

    }


 }