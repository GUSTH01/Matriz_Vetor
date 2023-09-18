import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomico = new Random();
        int[][] matriz = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[2][2];

        //gerar uma matriz triangular superior
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = randomico.nextInt(1, 10);
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = randomico.nextInt(1, 10);
                System.out.printf("[%2d] ", matriz2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                matriz3[i][j] = matriz[i][j] * matriz2[i][j];

                System.out.printf("[%2d] ", matriz3[i][j]);
            }
            System.out.println();
        }

    }
}



