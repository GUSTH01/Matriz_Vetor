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
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                soma = matriz[0][0] + matriz[0][2] + matriz[2][0] + matriz[2][2];
            }
        }
        System.out.println(soma);
    }
}

