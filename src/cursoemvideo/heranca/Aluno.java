package cursoemvideo.heranca;

public class Aluno extends Pessoa {

    // Atributos

    private boolean matricula;
    private String curso;

    // métodos

    public void cancelarMatricula(){
        matricula = false;
    }

    public void pagarMensalidade(){

    }

    public Aluno(String nome, int idade, String sexo, boolean matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
