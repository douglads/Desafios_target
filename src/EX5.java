import java.util.Scanner;

public class EX5 {
    public void ex5(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a palavra para inverter");
        String palavra = sc.next();

        for (int i = palavra.length()-1; i >= 0 ; i--) {
            System.out.print(palavra.charAt(i));
        }
        System.out.println("");
    }
}