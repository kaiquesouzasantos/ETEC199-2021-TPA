public class ForSequenciaFibonacci {
    public static void main(String args[]) {
        for(int cont=0,posterior=1;cont<=100;posterior+=cont,cont=posterior-cont){
            System.out.print(cont+"|");
        }
    }
}
