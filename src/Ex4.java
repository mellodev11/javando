import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int number,hoursWork;
        double value,result;

        System.out.println("Qual é o número do funcionário?");
        number = entrada.nextInt();
        System.out.println("Quantas horas trabalhadas?");
        hoursWork = entrada.nextInt();
        System.out.println("Digite o valor da hora de trabalho");
        value = entrada.nextDouble();

        result = hoursWork*value;
        System.out.println("Number = "+number);
        System.out.printf("Salario = $ %.2f %n",result);


        entrada.close();
    }
}
