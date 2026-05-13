import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        Scanner e= new Scanner(System.in);
        int numeros[] = new int[10];

        for(int i= 0; i<10; i++ ){
            System.out.println("Digite o numero: "+(i+1));
            numeros[i] = e.nextInt();

        }
        System.out.println("Numeros pares");
        for(int i=0; i<10; i++){

            if(numeros[i]% 2 ==0){
            System.out.println(numeros[i]);
            }
        }
        System.out.println("Numeros impares");
        for(int i=0; i<10; i++){
            if (numeros[i]% 2 != 0)
                System.out.println(numeros[i]); {
                
            }

        }
        e.close();



    }

}
