import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int saqueUser;
        int restante;
        int notasCem;
        int notasCinquenta;
        int notasDez;
        int notasCinco;
        int notasUm;

        System.out.println(
        """
        Descubra quantas notas de saque você terá!
        Digíte valores inteiros entre 10 e 600!
                
        """);

        while(true){
            
            saqueUser = sc.nextInt();

            if(saqueUser<10||saqueUser>600){
                System.out.println("Valor fora dos limítes, digíte outro valor!");
                continue;
            }else{
                break;
            }
        }

        restante = saqueUser;

        notasCem = restante/100;
        restante = restante%100;
        
        notasCinquenta = restante/50;
        restante = restante%50;

        notasDez = restante/10;
        restante = restante%10;

        notasCinco = restante/5;
        restante = restante%5;
        
        notasUm = restante/1;

        System.out.println("Quantidade de notas 100: " + notasCem);
        System.out.println("Quantidade de notas 50: " + notasCinquenta);
        System.out.println("Quantidade de notas 10: " + notasDez);
        System.out.println("Quantidade de notas 5: " + notasCinco);
        System.out.println("Quantidade de notas 1: " + notasUm);

    }
}
