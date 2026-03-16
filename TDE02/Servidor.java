import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String[] args) {

        try {

            LocateRegistry.createRegistry(1099);

            DaoPessoa dao = new DaoPessoa();

            Naming.rebind("rmi://localhost/DaoPessoa", dao);

            System.out.println("Servidor RMI pronto.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}