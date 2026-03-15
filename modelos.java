package carros;

import java.util.Scanner;

public class modelos {

    Scanner scanner = new Scanner(System.in);

    boolean continuar = true;



public String modelo1 ="gol" ;
public String modelo2 = "tesla";
public String modelo3 = "ferrari";
public String modelo4 = "fiat";

public String escolhermodelos() {

    while (continuar) {

        System.out.println("voce que comprar qual carro?");
        String escolhermodelo = scanner.next();

        if (escolhermodelo.equals(modelo1) ) {
            System.out.println("voce escolheu o gol ");
            System.out.println("e ele sai por 15.000");
        } else if (escolhermodelo.equals(modelo2)) {
            System.out.println("voce escolheu o tesla ");
            System.out.println("e ele sai por 100.000");
        } else if (escolhermodelo.equals(modelo3)) {
            System.out.println("voce escolheu a ferrari ");
            System.out.println("e ele sai por 1000.000");
        } else if (escolhermodelo.equals(modelo4)) {
            System.out.println("voce escolheu o fiat ");
            System.out.println("e ele sai por 80.000");
        }
        System.out.println("voce deseja comprar denovo? s/n");
        if (scanner.next().equals("n")) {
            continuar = false;
        }

    }
    return  escolhermodelos();
}
}
