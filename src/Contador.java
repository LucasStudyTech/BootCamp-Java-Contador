import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        //chamando a class terminal
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
                contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
    }


    static public class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro");
        }

        int contagem = parametroDois - parametroUm + 1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }
}
