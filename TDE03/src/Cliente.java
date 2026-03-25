import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {

            ConversorDoubleInterface conversorCli = (ConversorDoubleInterface) Naming.lookup("rmi://localhost/ConversorDouble");

            double valor = -14.9;

            String resultado = conversorCli.ConverterEmBits(valor);
        
            System.out.println(resultado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
