import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int code1,quantity1,code2,quantity2;
        double value1,value2,som1,som2,result;

        System.out.println("Qual codigo da peça?");
        code1 = entrada.nextInt();
        System.out.println("Qual a quantidade escolhida?");
        quantity1 = entrada.nextInt();
        System.out.println("Qual valor da peça");
        value1 = entrada.nextDouble();

        som1 = quantity1*value1;

        System.out.println("Qual codigo da peça?");
        code2 = entrada.nextInt();
        System.out.println("Qual a quantidade escolhida?");
        quantity2 = entrada.nextInt();
        System.out.println("Qual valor da peça");
        value2 = entrada.nextDouble();

        som2 = quantity2*value2;


        result = som1 + som2;
        System.out.printf("O valor a pagar : %.2f%n",result);


        entrada.close();
    }





}
