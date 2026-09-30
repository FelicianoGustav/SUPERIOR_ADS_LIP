import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números e descubra o MDC");
        System.out.print("Digite o primeiro número: ");
        int numUserP = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numUserS = sc.nextInt();

        
        int MDCP = numUserP;
        int MDCS = numUserS;

        
        while (MDCS != 0) {
            int resto = MDCP % MDCS;
            MDCP = MDCS;
            MDCS = resto;
        }

        // O 'a' agora guarda o MDC
        System.out.println("O MDC entre " + numUserP + " e " + numUserS + " é: " + MDCP);
        
    }
}