import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[5];
        

        for (int i=0; i<5; i++){
            System.out.print("Digite o numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maior= maiorVetor(numeros);
        int menor= menorVetor(numeros);
        int media= mediaVetor(numeros);

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);
        sc.close();
    }

    public static int maiorVetor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menorVetor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int mediaVetor(int[] vetor) {
        int max = maiorVetor(vetor);
        int min = menorVetor(vetor);

        return (max + min) / 2;
        
    }

}
