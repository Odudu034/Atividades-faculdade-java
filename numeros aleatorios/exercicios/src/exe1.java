
import java.util.Random;

public class exe1 {
    public static void main (String[] args){

        Random random = new Random();
        int numeros[] = new int[10];

        for(int i =0; i<10; i++){

            numeros[i] = 1 + random.nextInt(10);
            System.out.println("Numero sorteado: " +numeros[i]);


        }

        int menor = numeros[0];

        for(int i=1; i< 10; i++){

            if(numeros[i] < menor){
                menor= numeros[i];
            }
        }
        System.out.println("Esse e o menor numero sorteado: "+menor);


    }

}
