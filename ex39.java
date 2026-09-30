import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Verifique se seu número é perfeito!");
        System.out.println("Digíte um número: ");
        int numUser = sc.nextInt();
        double contador = 0;
        int numPerfeito = 0;

        for(int cont=1;cont<numUser;cont++){

            if(numUser%cont==0){
                numPerfeito+=cont;  
            }

        }

        if(numUser==numPerfeito){
            System.out.println("O seu número é perfeito!");
        }else{
            System.out.println("O seu número é não perfeito!");
        }

        



    }
}
