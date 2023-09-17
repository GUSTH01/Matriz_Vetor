 import java.util.Random;
public class Main {

        public static void main(String[] args) {
            Random randomico = new Random();
            int[][] matriz = new int[3][3];
            //gerar uma matriz triangular superior
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = randomico.nextInt(1, 10);
                    System.out.printf("[%2d] ", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.printf("[%2d] ", matriz[j][i]);
                }
                //pula uma linha
                System.out.println();
            }
        }
    }

