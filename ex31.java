import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        System.out.println("digíte a senha correta: ");

        double rest;

        for(int contador = 1;contador<=30;contador++){
            
            rest = contador%3;

            if(rest==0){
                continue;
            }
                System.out.println(contador);
        }

    }

}