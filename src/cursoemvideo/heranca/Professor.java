package cursoemvideo.heranca;

public class Professor extends Pessoa {

    // Atributos

    private String especialidade;
    private float salario;

    // métodos

    public void receberAumento(float salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
