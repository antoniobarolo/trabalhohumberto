import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

		String resp;
		do {
			resp = JOptionPane.showInputDialog("Escolha uma operação\n1. Cadastrar Empregado\n2. Cadastrar Cliente\n3. Pesquisar\n4. Listar Empregados\n5. Listar Clientes\n6.Remover\n7.Finalizar");
			switch (resp) {
            case "1":
            Object[] options = {"Gerente", "Vendedor"};
                    JOptionPane.showOptionDialog(null, "Cadastro de gerente ou vendedor?", "Cadastrar Empregado", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null,options, options[0]);
                    
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
            case "7":
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Se informe!");
			}
		} while (resp.equals("1") || resp.equals("2") || resp.equals("3") || resp.equals("4")|| resp.equals("5") ||  resp.equals("6")|| resp.equals("7")|| resp.contentEquals(null));

    }
}
