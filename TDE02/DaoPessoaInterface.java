import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DaoPessoaInterface extends Remote {

    boolean incluir(Pessoa novoObj) throws RemoteException;

    boolean removerPeloCpf(String cpf) throws RemoteException;

    Pessoa consultarPeloCpf(String cpf) throws RemoteException;

    List<Pessoa> consultarTodos() throws RemoteException;
}