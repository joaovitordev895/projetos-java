package conta;

import java.util.Scanner;

//isso e uma classe
public class conta {

    Scanner scanner = new Scanner(System.in);

//atributos da classe
    public String nome ;
    public int senha ;
    public int numero ;


//isso e um metodo com uma função
    public  String cadastro() {
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite sua senha: ");
        senha = scanner.nextInt();
        System.out.println("Digite seu numero: ");
        numero = scanner.nextInt();

        System.out.println("seu nome e " + nome);
        System.out.println("seu senha e " + senha);
        System.out.println("seu numero e " + numero);

         return  nome + " " + senha + " " + numero;
    }
}
