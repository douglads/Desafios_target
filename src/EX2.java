import java.util.Scanner;
import java.text.DecimalFormat;

public class EX2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("Informe qual exercicio voce quer ver:");
        System.out.println("Pressione 2 - Execercicio 2");
        System.out.println("Pressione 3 - Execercicio 3");
        System.out.println("Pressione 4 - Execercicio 4");
        System.out.println("Pressione 5 - Execercicio 5");
        System.out.println("Pressione 6 - Para fechar");
        int numEx = entrada.nextInt();
        switch (numEx) {
            case 2:
                ex2();
                main(args);
                break;
            case 3:
                System.out.println("Exercicio ainda não implementado:");
                main(args);
                break;
            case 4:
                EX4 ex4 = new EX4();
                ex4.ex4();
                main(args);
                break;
            case 5:
                EX5 ex5 = new EX5();
                ex5.ex5(args);
                main(args);
                break;

            case 6:
                break;
            default:
                System.out.println("Nao existe este exercicio");
                main(args);
                break;
        }
    }

    public static void ex2() {
        Scanner entrada = new Scanner(System.in);
        int i = 1, e = 0;
        System.out.println("Informe um numero para verificar se este existe na sequencia de FIBONACCI: ");
        int numDig = entrada.nextInt();

        if (numDig == 0) {
            System.out.println("O numero digitado corresponde a sequencia de FIBONACCI");
        } else {
            while (numDig > i) {
                e = i - e;
                i = e + i;
            }
            if (numDig == i) {
                System.out.println("O numero digitado corresponde a sequencia de FIBONACCI");
            } else {
                System.out.println("O numero digitado nao corresponde a sequencia de FIBONACCI");
            }
        }
    }
}