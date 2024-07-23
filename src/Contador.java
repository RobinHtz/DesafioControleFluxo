import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int soma = numeroUm+numeroDois;

        System.out.println(soma);
    }
}
