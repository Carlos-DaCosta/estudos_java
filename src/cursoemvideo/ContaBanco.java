package cursoemvideo;

import java.util.Scanner;

public class ContaBanco {

    private int numConta;
    private int getNumConta() {return numConta;}
    private void setNumConta(int numConta) {this.numConta = numConta;}

    protected String tipo;
    private String getTipo() {return tipo;}
    private void setTipo(String tipo) {this.tipo = tipo;}

    private String dono;
    private String getDono() {return dono;}
    private void setDono(String dono) {this.dono = dono;}

    private double saldo;
    private double getSaldo() {return saldo;}
    private void setSaldo(double saldo) {this.saldo = saldo;}

    private boolean status;
    private boolean getStatus() {return status;}
    private void setStatus(boolean status) {this.status = status;}


    public ContaBanco() {
        numConta = -1;
        dono = " ";
        tipo = " ";
        saldo = 0;
        status = false;
    }




    public void abrirConta() {
        if (this.dono.equals(" ") && this.tipo.equals(" ")) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu sobrenome: ");
                String sobrenome = sc.nextLine();
                System.out.println("Digite o tipo de conta: cc/cp");
                String tipo = sc.nextLine().toLowerCase();

                int min = 1;
                int max = 1000000;
                int randomInt = (int) (Math.random() * (max - min + 1)) + min;
                this.setNumConta(randomInt);

                this.setStatus(true);
                this.setDono(nome + " " + sobrenome);
                this.setTipo(tipo);

                if (tipo.equals("cc")) {
                    this.setSaldo(50);
                } else if (tipo.equals("cp")) {
                    this.setSaldo(150);
                } else {
                    saldo = 0;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (this.status == true) {
            System.out.println("A conta já está ativa!");
        } else {
            this.setStatus(true);
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta() {
        if (this.status == true) {
            try {
                if (this.getSaldo() == 0) {
                    System.out.println("Fechando Conta");
                    setStatus(false);
                } else if (this.getSaldo() < 0) {
                    System.out.println("Contas em débito não podem ser fechadas! ");
                } else if (this.getSaldo() > 0) {
                    System.out.println("A conta precisa ser esvaziada antes do fechamento!");
                } else {
                    System.out.println("erro ao fechar conta!");
                }
            } catch (Exception e) {
            }
        } else {
            System.out.println("A conta já esta fechada!");
        }
    }

    public void depositar() {
        Scanner sc = new Scanner(System.in);
        if (this.status == true) {
            try {
                System.out.print("Digite o valor a ser depositado: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("\nValor depositado com sucesso!");
            } catch (Exception e) {
                System.out.println("erro depositar valor! somente números!");
            }
        } else {
            System.out.println("A conta precisa estar ativa para depositar!");
        }
    }

    public void sacar() {
        Scanner sc = new Scanner(System.in);
        if (this.status == true) {
            System.out.println("Digite o valor a sacar: ");
            double valor = sc.nextDouble();
            try {
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } catch (Exception e) {
                System.out.println("erro sacar");
            }
        } else {
            System.out.println("A conta precisa estar ativa para sacar!");
        }
    }

    public void pagarMensal() {
        if (this.status == true) {
            if (tipo.equals("cc")) {
                try {
                    saldo -= 12;
                    System.out.printf("Pagando conta mensal... \nConta paga com sucesso");
                } catch (Exception e) {
                    System.out.println("saldo insuficiente");
                }
            } else if (tipo.equals("cp")) {
                try {
                    saldo -= 20;
                    System.out.printf("Pagando conta mensal... \nConta paga com sucesso");
                } catch (Exception e) {
                    System.out.println("saldo insuficiente");
                }
            } else {
                System.out.println("Tipo invalido");
            }
        } else {
            System.out.println("A conta precisa estar ativa para pagar!");
        }
    }

    public void checarExtrato() {
        if (this.status == true) {
            System.out.println("Extrato: R$" + this.getSaldo());
        } else {
            System.out.println("A conta precisa esta ativa para checar o extrato!");
        }
    }

    public void checarConta() {
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Status: " + this.getStatus());
    }
}