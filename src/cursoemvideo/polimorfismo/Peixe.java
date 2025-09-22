package cursoemvideo.polimorfismo;

public class Peixe extends Animal {

    private String corEscama;

    public void soltarBolha (){
        System.out.println("soltando bolha");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não faz som");
    }
}
