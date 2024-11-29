import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int result,a,b;

        a = entrada.nextInt();
        b = entrada.nextInt();
        result = a + b;
    System.out.println(a);
    System.out.println(b);
    System.out.println("A soma dos numeros foi: " +result);
        entrada.close();
    }
}