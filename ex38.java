import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Verifique se um número é um palíndromo!");
        System.out.println("Digíte um número: ");
        String numUser = sc.next();
        String textoInvertido = new StringBuilder(numUser).reverse().toString();

        if(numUser.equals(textoInvertido)){
            System.out.println("O seu número é um palíndromo");
        }else{
            System.out.println("O seu número não é um palíndromo");
        }

        



    }
}
