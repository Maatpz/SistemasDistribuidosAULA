import java.rmi.Naming;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {

        try {

            DaoPessoaInterface dao = (DaoPessoaInterface)
                    Naming.lookup("rmi://localhost/DaoPessoa");

            Pessoa p1 = new Pessoa("111", "teste1", 25);
            Pessoa p2 = new Pessoa("222", "teste2", 30);
            Pessoa p3 = new Pessoa("333", "teste3", 40);

            dao.incluir(p1);
            dao.incluir(p2);
            dao.incluir(p3);

            System.out.println("Todas as pessoas:");
            List<Pessoa> lista = dao.consultarTodos();

            for (Pessoa p : lista) {
                System.out.println(p);
            }

            System.out.println("\nConsulta pelo CPF 222:");
            System.out.println(dao.consultarPeloCpf("222"));

            dao.removerPeloCpf("222");

            System.out.println("\nApós remoção:");

            lista = dao.consultarTodos();

            for (Pessoa p : lista) {
                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}