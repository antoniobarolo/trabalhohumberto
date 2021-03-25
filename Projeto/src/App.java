import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String resp;
        do {
            resp = JOptionPane.showInputDialog("oi");
            switch (resp) {
            case "1":
                JOptionPane.showMessageDialog(null, "Tá tudo lotado!", "Eita!", JOptionPane.WARNING_MESSAGE);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Se informe!");
            }
        } while (resp.equals("1") || resp.equals("2") || resp.equals("3") || resp.equals("4") || resp.equals("5")
                || resp.equals("6") || resp.contentEquals(null));

    }

    ArrayList<Pessoa> dados = new ArrayList();

    public void CadastrarEmpregado(String nome, String cpf, String matricula) {
        Empregado novo = new Empregado();
        novo.setPessoa(nome, cpf);
        novo.setEmpregado(matricula);
        dados.add(novo);
    }

    public void CadastrarCliente(String nome, String cpf, double valorDaDivida) {
        Cliente novo = new Cliente();
        novo.setPessoa(nome, cpf);
        novo.setCliente(valorDaDivida);
        dados.add(novo);
    }

    public Pessoa Pesquisar(String cpf) {
        int n = dados.size();
        for (int i = 0; i < n; i++) {
            if (dados.get(i).cpf.equals(cpf)) {
                System.out.println("Esta pessoa é um " + dados.getClass());
                return dados.get(i);
            }
        }
        System.out.println("Cpf não encontrado...");
        return null;
    }

    public String ListarEmpregados() {
        int n = dados.size();
        Empregado aux = new Empregado();
        String impressao = "";
        for (int i = 0; i < n; i++) {
            if (dados.get(i).getClass().equals(aux.getClass())) {
                impressao += dados.get(i).toString();
            }
        }
        return impressao;
    }

    public String ListarClientes() {
        int n = dados.size();
        Cliente aux = new Cliente();
        String impressao = "";
        for (int i = 0; i < n; i++) {
            if (dados.get(i).getClass().equals(aux.getClass())) {
                impressao += dados.get(i).toString();
            }
        }
        return impressao;
    }

    public void Remover(String cpf) {
        int n = dados.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa deletada!");
            dados.remove(i);
        }
        System.out.println("Cpf não encontrado...");
    }
}
