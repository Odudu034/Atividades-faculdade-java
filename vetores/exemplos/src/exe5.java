public class exe5 {
    public static void main(String[] args){

        int[] vetorA = new int[]{10, 5, 20, 29, 34};
        int[] vetorB = new int[]{8, 2, 19, 8, 22};
        int[] vetorC = new int[5];

        for(int i=0; i<vetorA.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println("Elementes do vetorC: ");

        for(int i=0; i<vetorC.length; i++){
            System.out.println(vetorC[i]);
            
        }

        

    }

}
