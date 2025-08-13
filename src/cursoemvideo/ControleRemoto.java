package cursoemvideo;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public void abrirMenu() {
        if (ligado == true) {
            System.out.println(ligado);
            System.out.println(volume);
            for (int i = 0; i <= volume; i += 10) {
                System.out.println("|");
            }
            System.out.println(tocando);
        }
    }

    @Override
    public void fecharMenu() {
        if (ligado == true) {
            System.out.println("Fechando Menu");
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado == true) {
            this.volume = this.volume - 1;
        }
    }

    @Override
    public void maisVolume() {
        if (this.ligado == true) {
            this.volume = this.volume + 1;
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado == true && this.volume > 0) {
            this.volume = 0;
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado == true && this.volume == 0) {
            this.volume = 10;
        }
    }

    @Override
    public void play() {
        if (this.ligado == true && this.tocando == false) {
            this.tocando = true;
        }
    }

    @Override
    public void pause() {
        if (this.ligado == true && this.tocando == true) {
            this.tocando = false;
        }
    }


}
