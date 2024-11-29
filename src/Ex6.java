import java.util.Locale;
import java.util.Scanner;

public class Ex6 {


    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double A,B,C,pi;
        double triangulo,circulo,trapezio,quadrado,retangulo;
        pi = 3.14159;
        System.out.println("Digite o valor de A");
        A = entrada.nextDouble();
        System.out.println("Digite o valor de B");
        B = entrada.nextDouble();
        System.out.println("Digite o valor de C");
        C = entrada.nextDouble();

        triangulo = (A*C)/2;
        circulo = pi * C * C;
        trapezio = (A + B)*C /2;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("TRIANGULO :%.3f%n",triangulo);
        System.out.printf("CIRULO :%.3f%n",circulo);
        System.out.printf("TRAPEZIO :%.3f%n",trapezio);
        System.out.printf("QUADRADO :%.3f%n",quadrado);
        System.out.printf("RETANGULO: %.3f%n",retangulo);


    }
}
