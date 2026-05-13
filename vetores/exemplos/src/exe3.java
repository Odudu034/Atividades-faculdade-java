import java.util.Scanner;;

public class exe3 {
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        String nomes []= new String[5];

        for(int i=0; i<5; i++){
            System.out.println("digite nomes"+(i+1));
            nomes[i]=e.nextLine();
        }
        for(int i=4; i>=0; i--){
            System.out.println(nomes[i]);

        }
        System.out.println("primeiro nome: "+ nomes[0]);
        System.out.println("ultimo nome: " +nomes[4]);

        
        
    }
}
