package cursoemvideo;

public class Caneta {

    private String modelo;
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    private String cor;
    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    private float ponta;
    public float getPonta() {return ponta;}
    public void setPonta(float ponta) {this.ponta = ponta;}

    private int carga;
    public int getCarga() {return carga;}
    public void setCarga(int carga) {this.carga = carga;}

    private boolean tampada;
    public boolean getTampada() {return tampada;}
    public void setTampada(boolean tampada) {this.tampada = tampada;}

    //Metodo construtor
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        tampada = true;
        carga = 100;
    }

    void informacoes(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void tampar() {
        this.tampada = true;
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada!");
        } else {
            System.out.println("rabiscando...");
        }
    }
}
