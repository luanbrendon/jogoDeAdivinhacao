import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int tentativas = 0;

        System.out.println("Tente Adivinhar o numero entre 0 e 100: ");

        while (tentativas < 5) {
            System.out.println("Digite um numero: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;
            if (numeroDigitado == numAleatorio) {
                System.out.println("Parabens, voce acertou o numero" + numAleatorio);
                break;
            }else if (numeroDigitado < numAleatorio){
                System.out.println("Tente novamente o numero digitado e menor!");
            }else {
                System.out.println("Tente novamente o numero digitado e maior!");
            }
        }
        if (tentativas == 5) {
            System.out.println("Voce perdeu numero de tentativas acabou! " + tentativas);
            System.out.println("O numero era " +numAleatorio);
        }
        leitura.close();
        }
}