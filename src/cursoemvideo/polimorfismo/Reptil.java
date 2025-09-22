package cursoemvideo.polimorfismo;

public class Reptil extends Animal {


    private String corEscama;


    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

}
