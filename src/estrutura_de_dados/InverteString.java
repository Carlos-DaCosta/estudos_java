package estrutura_de_dados;

public class InverteString {

    public static void main(String[] args) {


        String sequencia = "123456";
        String invertida = "";

        for (int i = sequencia.length() - 1; i >= 0; i--) {
            invertida = invertida + sequencia.charAt(i);

        }

        System.out.println(invertida);

    }
}
