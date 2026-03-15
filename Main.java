import conta.conta;
import carros.modelos;
import java.util.Scanner;

public class Main {
    static void main() {

Scanner scanner= new Scanner(System.in);

        conta conta = new conta();
        conta.cadastro();

        System.out.println("=============================================");

        System.out.println("os modelos de carros");
        System.out.println("============================================");
        System.out.println("gol ");
    System.out.println("tesla");
        System.out.println("ferrari");
        System.out.println("fiat");
        System.out.println("=============================================");

        modelos modelos = new modelos();
        modelos.escolhermodelos();
    }
}
