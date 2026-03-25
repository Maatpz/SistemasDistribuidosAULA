import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String[] args) {

        try {

            LocateRegistry.createRegistry(1099);

            ConversorDouble conversor = new ConversorDouble();

            Naming.rebind("rmi://localhost/ConversorDouble", conversor);

            System.out.println("Servidor pronto!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}