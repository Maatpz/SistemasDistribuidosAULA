import java.io.FileInputStream;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) {

        String caminho = "Teste.txt";

        try (FileInputStream fis = new FileInputStream(caminho)) {

            int byteLido;
            char caracter;
            int contador = 0;

            while ((byteLido = fis.read()) != -1) {
                caracter = (char) byteLido;
                contador++;
                System.out.println("Byte: " + byteLido +  "|" + "Caractere: " + caracter );
            }
            System.out.println("Quantidade: " + contador + " bytes lidos.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}