import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double numeroUser;
        System.out.println("digíte um número e descubra se ele é primo");
        numeroUser = sc.nextDouble();
        double contador = 0;

        for(int cont=1;cont<=numeroUser;cont++){
            
            if(numeroUser%cont==0){
                contador++;
            }
            
            
        }

        if(contador>2){
            System.out.println("Seu número não é primo");
        }else{
            System.out.println("Seu número é primo");
        }

    }

}