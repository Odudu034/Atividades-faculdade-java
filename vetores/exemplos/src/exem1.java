import java.util.Scanner;

public class exem1 {

    public static void main(String[] args){

        int [] numeros = new int [10];
        Scanner e = new Scanner(System.in);

        for(int i=0; i<10; i++){

            System.out.println("Digite o numero "+ (i+1));
            numeros[i] = e.nextInt();
        }
        for(int i=0; i<10; i++){
            System.out.println("numero: "+(i+1) + " = " +numeros[i]);
        }
        e.close();
    }
}
