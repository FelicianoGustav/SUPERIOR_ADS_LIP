import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números e descubra o MMC");
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
        
        int mdc = MDCP;


        int mmc = Math.abs(numUserP * numUserS) / mdc;

        System.out.println("O MMC entre " + numUserP + " e " + numUserS + " é: " + mmc);
        
        sc.close();
    }
}