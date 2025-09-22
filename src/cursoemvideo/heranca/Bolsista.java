package cursoemvideo.heranca;

public class Bolsista extends Aluno{

    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso!");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, int idade, String sexo, boolean matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;


    }
}
