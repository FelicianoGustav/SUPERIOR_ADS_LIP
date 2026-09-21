import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        System.out.println("digíte um número inteiro e saiba o fatorial");
        int escolhaUser = sc.nextInt();
        int resultado = 1;

        for(int fatorial = 1;fatorial<=escolhaUser;fatorial++){
            
            resultado *= fatorial;

        }

        System.out.println("O resultado do fatorial é: " + resultado);

    }
}
