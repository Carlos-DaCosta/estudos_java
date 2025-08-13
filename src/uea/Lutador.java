package uea;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public void apresentar(){
        System.out.println("Nome do Lutador: " + this.nome);
        System.out.println("Nacionalidade do Lutador: " + this.nacionalidade);
        System.out.println("Idade do Lutador: " + this.idade);
        System.out.println("Altura do lutador: " + this.altura);
        System.out.println("Peso do lutador: " + this.peso);
        System.out.println("Categoria do lutador: " + this.categoria);
        System.out.println("Vitorias do lutador: " + this.vitorias);
        System.out.println("Derrotas do lutador: " + this.derrotas);
        System.out.println("Empates do lutador: " + this.empates);
    }

    public void status(){
        System.out.println(this.nome);
        System.out.println("é um peso " +  this.categoria);
        System.out.println(this.vitorias + " vitórias");
        System.out.println(this.derrotas + " derrotas");
        System.out.println(this.empates + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }




    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "invalido";
        } else if (this.peso <= 70.3){
            this.categoria = "leve";
        }  else if (this.peso <= 83.9){
            this.categoria = "médio";
        } else if (this.peso <= 120.2){
            this.categoria = "pesado";
        } else {
            this.categoria = "invalido";
        }
    }

    private int getVitorias() {
        return vitorias;
    }
    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    private int getDerrotas() {
        return derrotas;
    }
    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    private int getEmpates() {
        return empates;
    }
    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
