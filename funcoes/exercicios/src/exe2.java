public class exe2 {
    public static void imprimeNovaMensagem(String parametro){
        System.out.println("Meu primeiro programa com funcoes e parametros: " + parametro );
    }

    public static void main(String[]args){
        System.out.println("antes de chamar o metodo"); 
        imprimeNovaMensagem("java"); 
         imprimeNovaMensagem("Senac"); 
          imprimeNovaMensagem("doce"); 
        System.out.println("depois de chamar o metodo");
    }
}
