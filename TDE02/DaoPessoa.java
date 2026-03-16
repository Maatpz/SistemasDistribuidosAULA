import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class DaoPessoa extends UnicastRemoteObject implements DaoPessoaInterface {

    private static List<Pessoa> listaPessoa = new ArrayList<>();

    public DaoPessoa() throws RemoteException {
        super();
    }

    @Override
    public boolean incluir(Pessoa novoObj) throws RemoteException {
        return listaPessoa.add(novoObj);
    }

    @Override
    public boolean removerPeloCpf(String cpf) throws RemoteException {
        return listaPessoa.removeIf(p -> p.getCpf().equals(cpf));
    }

    @Override
    public Pessoa consultarPeloCpf(String cpf) throws RemoteException {

        for (Pessoa p : listaPessoa) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }

        return null;
    }

    @Override
    public List<Pessoa> consultarTodos() throws RemoteException {
        return listaPessoa;
    }
}