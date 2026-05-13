public class exe6 {
    public static void main(String[] args) {
        int[] vetorA = new int[]{8, 9, 2, 8};
        int[] vetorB = new int[]{40, 22, 81, 4, 58, 80};
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorC[i] = vetorA[i];
        }

        for(int i=0; i<vetorB.length; i++){
            vetorC[i+vetorA.length] = vetorB[i];
        }
        System.out.println("Elementes do vetorC: ");

        for(int i=0; i<vetorC.length; i++){
            System.out.println(vetorC[i]);
            
        }
    }

}
