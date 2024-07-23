import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        try {
            comparar(numeroUm, numeroDois);

        }catch (ParametrosInvalidosException exception) {
            System.err.println("O primeiro número deve ser menor que o segundo número.");
        }
        }

    static void comparar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if(numeroUm > numeroDois)
            throw new ParametrosInvalidosException();

        int conta = numeroDois - numeroUm;
        for (int x = 1; x <= conta; x++) {
            System.out.println("Imprimindo o número " + x);
        }
    }

}
