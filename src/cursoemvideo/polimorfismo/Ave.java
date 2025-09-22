package cursoemvideo.polimorfismo;

public class Ave extends Animal {

    private String corPena;

    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de passaro");
    }
}
