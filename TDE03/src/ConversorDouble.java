import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversorDouble extends UnicastRemoteObject implements ConversorDoubleInterface {
    
    public ConversorDouble() throws RemoteException {
        super();
    }

    @Override
    public String ConverterEmBits(double valor) throws RemoteException {

        long bits = Double.doubleToRawLongBits(valor);

        StringBuilder res = new StringBuilder();

        res.append("Double: ").append(valor).append("\n");

        res.append("Representação em Long: ").append(bits).append("\n");

        for (int i = 63; i >= 0; i--) {

            long bit = (bits >> i) & 1;
            
            res.append(bit);
            if (i == 63 || i == 52) {
                res.append(" | ");
            }
        }
        return res.toString();
    }
}