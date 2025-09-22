package cursoemvideo.projetofinal;

public class Visualizacao{

    private String espectado;
    private String filme;

    public void avaliar(){
    }

    public void avaliar(float nota){}

    public void avaliar(int porc){}

//    public Visualizacao(Gafanhoto espectado, Video filme) {
//        this.espectado = espectado;
//        this.filme = filme;
//        this.espectado.setTotAssistido(this.espectado.getTotAssistido() + 1);
//        this.filme.setViews(this.filme.getViews() + 1);
//    }

    public String getEspectado() {
        return espectado;
    }

    public void setEspectado(String espectado) {
        this.espectado = espectado;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
}
