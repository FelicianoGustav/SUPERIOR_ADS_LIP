import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int verificador = 0;

        for(int contador = 1;contador<=100;contador++){

            int auxiliarCont = contador;
            verificador = 0;
            
            while(auxiliarCont>0){

                if(contador%auxiliarCont==0){
                    verificador++;
                }

                auxiliarCont--;
            }

            if(verificador==2){
                System.out.println("Os números primos são: ");
                System.out.println(contador);
            }
        }
    }
}
