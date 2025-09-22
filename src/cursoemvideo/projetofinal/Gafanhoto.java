package cursoemvideo.projetofinal;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public void viuMaisUm(){
    }

    @Override
    protected void ganharExperiencia() {

    }

    public Gafanhoto(String login, int totAssistido) {
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
