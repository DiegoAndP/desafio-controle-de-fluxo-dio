import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro: ");
            Integer parametroPrimero = scanner.nextInt();
            System.out.println("Digite o segundo Parâmetro: ");
            Integer parametroSegundo = scanner.nextInt();
            scanner.close();

            try {
                contar(parametroPrimero, parametroSegundo);
            }
            catch (ParametrosInvalidosException e) {
                System.out.println("O primeiro parâmetro não pode ser maior que o o segundo.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Parâmetros exigem o uso de números inteiros.");
        }

    }

    static void contar(Integer primeiroParametro, Integer segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }
        Integer contagem = segundoParametro = primeiroParametro;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }

        System.out.println("Fim da contagem.");
    }
}
