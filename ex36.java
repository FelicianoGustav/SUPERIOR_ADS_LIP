import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Faça o orçamento e descubra o valor para pintar alguma área");
        System.out.println("Digíte a área a ser pintada em metros quadrados: ");
        double areaUser = sc.nextDouble();


        double areaUserFolga = Math.ceil((areaUser*0.1)+areaUser);
        double quantidadeLata = Math.ceil(areaUserFolga/18);
        double valorTotalLata = 80.00*quantidadeLata;
        double quantidadeGalao = Math.ceil(areaUserFolga/4);
        double valorTotalGalao = 25.00*quantidadeGalao;

        double qtdMinimaLata = Math.floor(areaUserFolga/18);
        System.out.println(qtdMinimaLata);
        double restante = areaUserFolga%18;
        System.out.println(restante);
        double qtdMinimaGalao = Math.ceil(restante/4);


        System.out.println("---------------------Galão--------------------------");
        System.out.println("Quantidade total apenas galão: " + quantidadeGalao);
        System.out.println("Valor total apenas galão: " + valorTotalGalao);
        System.out.println("---------------------Lata--------------------------");
        System.out.println("Quantidade total apenas Latas: " + quantidadeLata);
        System.out.println("Valor total apenas Latas: " + valorTotalLata);
        System.out.println("-----------------Juntos---------------------");
        System.out.println("Quantidade de latas: " + qtdMinimaLata);
        System.out.println("Quantidade de galões: " + qtdMinimaGalao);
        System.out.println("Valor total: " + ((qtdMinimaGalao * 25.00)+(qtdMinimaLata * 80.00)));
        

    }
}
