import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if (isPar(num)) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }
        sc.close();
    }

        public static boolean isPar(int numero) { 
            return numero % 2 == 0;
        }

}
