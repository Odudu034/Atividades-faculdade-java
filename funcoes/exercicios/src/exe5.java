import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7 para escolher um dia da semana: ");
        int dia = sc.nextInt();

        String Dia = exibirDiaSemana(dia);

        System.out.println("O dia da semana é: " + Dia);
        sc.close();
    }

    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Número inválido. Digite um número de 1 a 7.";
        }
    }
}
