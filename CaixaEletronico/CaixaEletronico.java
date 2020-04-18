import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {

		Conta conta01 = new Conta();

		String nconta = JOptionPane.showInputDialog("Digite o numero da conta: ");

		if (nconta.equals(conta01.numero)) {

			String senha = JOptionPane.showInputDialog("Digite a senha: ");

			if (senha.equals(conta01.senha)) {
				conta01.chamarMenu();
			} else {
				JOptionPane.showMessageDialog(null, "Senha invalida");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta inexistente");
		}
	}

}
