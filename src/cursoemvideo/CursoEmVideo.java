package cursoemvideo;

import java.util.Scanner;



public class CursoEmVideo {

    static void espaco(){
        System.out.print("""
                
                
                
                
                
                
                
                
                """);
    }

    public static void load() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nClique enter para continuar...");
        in.nextLine();
        System.out.print("\n");
        System.out.print("""
                
                
                
                
                
                """);
    }

    public static void calculos() {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            int valor = in.nextInt();

            System.out.println("resto da divisão por 2: " + valor % 2);
            System.out.println("elevado ao cubo: " + Math.pow(valor, 3));
            System.out.println("raiz quadrada: " + Math.sqrt(valor));
            System.out.println("raiz cubica: " + Math.cbrt(valor));
            System.out.println("valor absoluto: " + Math.abs(valor));
        } catch (ArithmeticException e) {
            System.out.println("Erro ao calcular o valor absoluto!");
        }
        load();
        menu();
    }


    public static void advinha() {

        Scanner in = new Scanner(System.in);
        try {
            double random = 1 * Math.random() * 5 + 1;
            int valor = (int) random;
            int chute = 0;

            while(chute != valor) {
                System.out.println("Estou pensando em um valor entre 1 e 5!");
                System.out.print("chutar: ");
                chute = in.nextInt();
                if (chute == valor) {
                    System.out.println("parabens você acertou! ");
                } else {
                    System.out.println("você errou! ");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro ao calcular o valor absoluto!");
        }
        load();
        menu();
    }

    public static void fatorial() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Digite um número para calcular o fatorial: ");
            int valor = in.nextInt();
            int fact = 1;

            for (int i = 1; i <= valor; i++) {
                fact = fact * i;
            }
            System.out.println("O fatorial de " + valor + " é " +  fact);
        }catch (ArithmeticException e) {
            System.out.println("Erro ao calcular o valor absoluto!");
        }
        load();
        menu();
    }

    public static void bissexto() {
        try {
            String month[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};
            Scanner in = new Scanner(System.in);
            System.out.print("Digite o ano: ");
            int ano = in.nextInt();

            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                for (int i = 0; i < dias.length; i++) {
                    if (i == 1) {
                        System.out.printf("O mês de %s tem 29 dias porque o ano de %s é bissexto! \n", month[i], ano);
                    } else {
                        System.out.printf("o mês de %s tem %d dias! \n", month[i], dias[i]);
                    }
                }
            } else {
                for (int i = 0; i < dias.length; i++) {
                    System.out.printf("O mês %s no ano %s de tem %d dias! \n", month[i], ano, dias[i]);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro ao calcular o valor absoluto!");
        }
        load();
        menu();
    }

    static void caneta() {
        try {
            Caneta c1 = new Caneta("bic", "azul", 0.5f);
            //c1.informacoes();

            c1.setCor("preta");
            c1.informacoes();

            Caneta c2 = new Caneta("bic", "azul", 0.7f);
            c2.rabiscar();
            c2.setTampada(false);
            c2.rabiscar();
        }catch (RuntimeException e) {
            System.out.println("error");
        }
        load();
        menu();
    }

    static void banco(){

        try {
            ContaBanco c1 = new ContaBanco();

//        c1.abrirConta();
//        c1.checarConta();
            Scanner in = new Scanner(System.in);
            System.out.printf("1. Abrir conta. \n2. Checar status da conta. \n3. Checar extrato \n4. Depositar. \n5. Sacar. \n6. Pagar mensalidade. \n7. Fechar conta \n8. Sair. \n\n");
            int input = in.nextInt();
            while (input != 8) {
                switch (input) {
                    case 1:
                        espaco();
                        c1.abrirConta();
                        System.out.println("\n ");
                        load();
                        break;
                    case 2:
                        espaco();
                        c1.checarConta();
                        System.out.println("\n ");
                        load();
                        break;
                    case 3:
                        espaco();
                        c1.checarExtrato();
                        System.out.println("\n ");
                        load();
                        break;
                    case 4:
                        espaco();
                        c1.depositar();
                        System.out.println("\n ");
                        load();
                        break;
                    case 5:
                        espaco();
                        c1.sacar();
                        System.out.println("\n ");
                        load();
                        break;
                    case 6:
                        espaco();
                        c1.pagarMensal();
                        System.out.println("\n ");
                        load();
                        break;
                    case 7:
                        espaco();
                        c1.fecharConta();
                        System.out.println("\n ");
                        load();
                        break;
                    case 8:
                        menu();
                        break;
                    default:
                }
                System.out.printf("1. Abrir conta. \n2. Checar status da conta. \n3. Checar extrato \n4. Depositar. \n5. Sacar. \n6. Pagar mensalidade. \n7. Fechar conta \n8. Sair. \n\n");
                input = in.nextInt();
            }
        } catch (RuntimeException e) {
            System.out.println("error");
        }
        load();
        menu();
    }

    static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Qual função deseja acessar?
                
                1. Calculos
                2. Advinha
                3. Fatorial
                4. Bissexto
                5. Caneta
                6. Banco
                7. encerrar
                ============================
                """);
        int input = in.nextInt();
        while (input != 7) {
            switch (input) {
                case 1 -> calculos();
                case 2 -> advinha();
                case 3 -> fatorial();
                case 4 -> bissexto();
                case 5 -> caneta();
                case 6 -> banco();
                case 7 -> System.exit(0);
                default -> {
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {


        //calculos();
        //advinha();
        //fatorial();
        //bissexto();
        //caneta();
//        banco();
        menu();
    }
}