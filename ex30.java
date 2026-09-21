import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        System.out.println("digíte a senha correta: ");

        while (true) {
            String senha = sc.next();

            if(senha.equals("java123")){
                
                System.out.println("Parabéns senha correta!");

            }else{
                System.out.println("Senha incorreta!");
            }
            
        }

    }
}
