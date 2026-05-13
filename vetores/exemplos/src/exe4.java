public class exe4 {
    public static void main(String[] args){

        int[] vetorA = new int[]{1, 5, 7, 3, 8};
        int[] vetorB = new int[(vetorA.length)];

        for(int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i] * 3;
        }
        System.out.println("Elementes do vetorB: ");

        for(int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i]);
            
        }

        

    }

}
