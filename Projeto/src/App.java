import java.util.ArrayList;
import javax.swing.JOptionPane;

//oi humberto
public class App {
    static ArrayList<Pessoa> dados = new ArrayList();

    public static void main(String[] args) throws Exception {
        String nome, cpf;
        double valorDaDivida;
        String resp;
        while (true) {
            resp = JOptionPane.showInputDialog(
                    "Escolha uma operação\n1. Cadastrar Empregado\n2. Cadastrar Cliente\n3. Pesquisar\n4. Listar Empregados\n5. Listar Clientes\n6.Remover\n7.Finalizar");
            switch (resp) {
            case "1":
                nome = JOptionPane.showInputDialog("Informe o nome");
                cpf = JOptionPane.showInputDialog("Informe o cpf");
                String matricula = JOptionPane.showInputDialog("Informe a matrícula");
                CadastrarEmpregado(nome, cpf, matricula);
                break;
            case "2":
                nome = JOptionPane.showInputDialog("Informe o nome");
                cpf = JOptionPane.showInputDialog("Informe o cpf");
                valorDaDivida = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da dívida"));
                CadastrarCliente(nome, cpf, valorDaDivida);
                break;
            case "3":
                cpf = JOptionPane.showInputDialog("Informe o cpf a ser pesquisado");
                Pesquisar(cpf);
                break;
            case "4":
                JOptionPane.showMessageDialog(null, ListarEmpregados());
                break;
            case "5":
                JOptionPane.showMessageDialog(null, ListarClientes());
                break;
            case "6":
                cpf = JOptionPane.showInputDialog("Informe o cpf a ser removido");
                Remover(cpf);
                break;
            case "7":
                return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Se informe!");
            }
        }
    }

    public static void CadastrarEmpregado(String nome, String cpf, String matricula) {
        Object[] itens = { "Gerente", "Vendedor" };
        Object tipo = JOptionPane.showInputDialog(null, "Para gerente ou vendedor?", null,
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        if (tipo == "Gerente") {
            Gerente novo = new Gerente();
            novo.setPessoa(nome, cpf);
            novo.setEmpregado(matricula);
            dados.add(novo);

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
            double bonus = Double.parseDouble(JOptionPane.showInputDialog("Informe o bônus"));
            novo.setGerente(salario, bonus);

        } else if (tipo == "Vendedor") {
            Vendedor novo = new Vendedor();
            novo.setPessoa(nome, cpf);
            novo.setEmpregado(matricula);
            dados.add(novo);

            double totalDasVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total das vendas"));
            double comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe a comissão"));
            novo.setVendedor(totalDasVendas, comissao);

        } else {
            JOptionPane.showMessageDialog(null, "Você precisa escolher uma opção!");
            return;
        }
    }

    public static void CadastrarCliente(String nome, String cpf, double valorDaDivida) {
        Cliente novo = new Cliente();
        novo.setPessoa(nome, cpf);
        novo.setCliente(valorDaDivida);
        dados.add(novo);
    }

    public static void Pesquisar(String cpf) {
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).cpf.equals(cpf)) {
                JOptionPane.showMessageDialog(null, dados.get(i) + "\nEsta pessoa é um " + dados.get(i).getClass());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cpf não encontrado...");
    }

    public static String ListarEmpregados() {
        int n = dados.size();
        Empregado aux = new Empregado();
        String impressao = "";
        for (int i = 0; i < n; i++) {
            if (aux.getClass() == dados.get(i).getClass().getSuperclass()) {

                impressao += "\n" + dados.get(i).toString();
            }
        }
        return impressao;
    }

    public static String ListarClientes() {
        Cliente aux = new Cliente();
        String impressao = "";
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).getClass().equals(aux.getClass())) {
                impressao += "\n" + dados.get(i).toString();
            }
        }
        return impressao;
    }

    public static void Remover(String cpf) {
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).cpf.equals(cpf)) {
                int ctz = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Tem certeza?",
                        JOptionPane.YES_NO_OPTION);
                if (ctz != 0) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Pessoa deletada!");
                dados.remove(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cpf não encontrado...");
    }
}
