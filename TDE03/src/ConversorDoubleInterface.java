import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConversorDoubleInterface extends Remote {
    String ConverterEmBits(double valor) throws RemoteException;
    
}
