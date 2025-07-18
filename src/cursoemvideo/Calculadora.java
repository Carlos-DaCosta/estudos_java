package cursoemvideo;

import java.util.Scanner;

public class Calculadora {

    public static void calculo () {

        Scanner in =  new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor1 = in.nextDouble();

        System.out.print("Digite outro valor: ");
        double valor2 = in.nextDouble();

        System.out.print("Digite a operacao valida (+, -, *, /): ");
        char operacao = in.next().charAt(0);

        double res;

        switch (operacao) {
            case '+':
                res =  valor1 + valor2;
                System.out.println(res);
                break;
            case '-':
                res =  valor1 - valor2;
                System.out.println(res);
                break;
            case '*':
                res =  valor1 * valor2;
                System.out.println(res);
                break;
            case '/':
                res =  valor1 / valor2;
                System.out.println(res);
                break;
            default:
                System.out.println("operacao invalido");
        }
    }

    public static void main(String[] args) {

    calculo();

    }
}
