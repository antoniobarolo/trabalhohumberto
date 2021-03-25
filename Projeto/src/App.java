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
		} while (resp.equals("1") || resp.equals("2") || resp.equals("3") || resp.equals("4")|| resp.equals("5") ||  resp.equals("6")|| resp.contentEquals(null));

    }
}
