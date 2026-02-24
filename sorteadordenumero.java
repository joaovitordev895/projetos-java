import java.util.Random;
import java.util.Scanner;

public class sorteadordenumero {
    static void main() {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int chute = 0;
        int tentativa = 0;
        int secreto = r.nextInt(100);

        while (chute != secreto){

            System.out.println("digite um numero de 1 a 100: ");
            chute =scanner.nextInt();

            tentativa++;

            if (chute > secreto){
                System.out.println("voce chutou alto");
            }
            else if (chute < secreto){
                System.out.println("voce chutou baixo");
            }
            else
                System.out.println("voce acertou o numero");
            System.out.println("voce tem  " + tentativa + "tentativas");



        }
    }
}
