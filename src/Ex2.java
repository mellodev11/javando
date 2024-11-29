import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        double raio, pi, result;
        pi = 3.14159;

        System.out.println("Digite o valor do raio");
        raio = entrada.nextDouble();


        raio = Math.pow(raio, 2);
        result = pi * raio;

        System.out.printf("O resultado da área é %.4f \n", result);


        entrada.close();
    }


}
