package estrutura_de_dados;

public class Piramide {

    public static void main(String[] args) {

        int base = 7;
        String bloco = "#";


        //piramide invertida

        for (int i = base; i > 0; i-=2) {
            for (int j=0; j<i; j++){
                System.out.print('#');
            }
            System.out.println();
        }




    }
}
