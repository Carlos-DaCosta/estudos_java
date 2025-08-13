package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {


    public static void calcularPrimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        int count = 0;
        for (int i=1;i<=numero;i++){
            if (numero%i==0){
                count++;
            }
        }
        if (count==2 || numero == 1){
            System.out.println("Primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    public static void main(String[] args) {
        calcularPrimo();
    }
}
