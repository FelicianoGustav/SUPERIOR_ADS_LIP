import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        System.out.println("digíte número aleatórios");
        double numeroUser;
        double soma = 0;

        for(;;){
            
            numeroUser = sc.nextDouble();

            if(numeroUser<0){
                System.out.println("Não digíte número negativos!");
                System.out.println("Valor da soma dos números digitados :"+soma);
                break;
            }else{
                soma = soma+numeroUser;
            }
        }

    }

}