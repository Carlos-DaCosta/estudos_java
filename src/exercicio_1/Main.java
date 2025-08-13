package exercicio_1;

public class Main {

    public static void main(String[] args) {
        Pessoa  p1 = new Pessoa("carlos", 19, "masculino");
        Livro l1 = new Livro("Star Wars", "george Lucas", 500);

        l1.detalhes();
    }
}
