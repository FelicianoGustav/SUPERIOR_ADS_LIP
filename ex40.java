import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte a quantidade que deseja da sequência de Fibonacci ");
        int numUser = sc.nextInt();
        int numAnterior = 0;
        int numAtual = 1;
        int proximo = 0;
        int contador = 0;
        

        System.out.println("Sequência desejada abaixo:");

        while (true) {

            if(contador==numUser){
                break;
            }

            System.out.println(numAnterior);

            proximo = numAnterior + numAtual;

            numAnterior = numAtual;
            numAtual = proximo;

            contador++;
        }
   



    }
}
