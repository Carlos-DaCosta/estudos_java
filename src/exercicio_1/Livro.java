package exercicio_1;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public void detalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de paginas: " + this.totalPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        if (this.aberto == true) {
            System.out.println("O livro já está aberto!");
        } else {
            System.out.println("Abrindo o Livro");
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.aberto == false) {
            System.out.println("O livro já está fechado!");
        } else {
            System.out.println("Fechando o Livro");
            this.setAberto(false);
        }
    }

    @Override
    public void folhear() {

    }

    @Override
    public void avancarPag() {
        if (this.getPaginaAtual() >= this.getTotalPaginas()) {
            System.out.println("Pagina insuficiente");
        } else {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPaginaAtual() <= 0) {
            System.out.println("Impossivel voltar ao Pagina");
        } else {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        }
    }
}
