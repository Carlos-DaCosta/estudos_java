package cursoemvideo.heranca;

public class Tecnico extends Aluno{

    private String registroProfissional;

    public void praticar(){

    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public Tecnico(String nome, int idade, String sexo, boolean matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;


    }
}
