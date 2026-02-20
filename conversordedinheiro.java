import java.util.Scanner;

public class conversordedinheiro {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

        System.out.println("digite o valor do dolar: ");
        float dolar = scanner.nextFloat();

        System.out.println("digite o valor do produto ");
        float produto = scanner.nextFloat();


        float valorfinal = produto * dolar;

        System.out.println("o resultado da conversao em dolar para real foi " + valorfinal);
        int valorInteiro = (int) produto;

        System.out.println("https://www.bcb.gov.br/conversao");

            System.out.print("Deseja repetir? (s/n): ");
            continuar = scanner.next();
        }

    }
}
