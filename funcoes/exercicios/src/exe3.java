import java.util.Scanner;

public class exe3 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, encontrarMax;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        encontrarMax = maior(n1, n2); 
        System.out.println("Fim da busca");
        System.out.println("O maior parametro é: " + encontrarMax);
    }

        public static int maior(int n1, int n2) { 
            if(n1>n2){
                return n1;
            }else{
                return n2;
            }
        }

}
