import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random randomico = new Random();
        int[] vetor = new int[10];
        int maior = 0;
        for (int i = 0; i < 10; i++) {
            vetor[i] = randomico.nextInt(1,100);
            System.out.println("vetor = " + vetor[i]);
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("maior é " + maior);
    }
}