import java.util.Scanner;

public class exe7 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        int fatorial= 1;

        for (int i = 1; i <= num; i++){
            fatorial= fatorial * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
        sc.close();
    }

}
