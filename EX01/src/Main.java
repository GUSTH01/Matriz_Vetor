import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int soma = 0;
        Random randomico = new Random();
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {

            vetor[i] = randomico.nextInt(1,10 );
            System.out.printf("[%2d]", vetor[i]);
            soma += vetor[i];

        }

        System.out.println("\nsoma = " + soma);


        }
    }
