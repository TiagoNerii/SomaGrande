import java.util.Scanner;

public class SomaElementosColecao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho da coleção (n): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            return;
        }

        System.out.println("Digite os elementos da coleção separados por espaço :");

        long[] colecao = new long[n];

        for (int i = 0; i < n; i++) {
            colecao[i] = scanner.nextLong();

            if (colecao[i] < 0 || colecao[i] > Math.pow(10, 10)) {
                return;
            }
        }

        long soma = calcularSoma(colecao);

        System.out.println("A soma dos elementos é: " + soma);

        scanner.close();
    }

    private static long calcularSoma(long[] colecao) {
        long soma = 0;

        for (long elemento : colecao) {
            soma += elemento;
        }

        return soma;
    }
}
