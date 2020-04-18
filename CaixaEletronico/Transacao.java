import java.util.ArrayList;
import java.util.Date;

public class Transacao {
	double valor;
	Date dia;
	String codigo = "";

	static ArrayList<Transacao> saque = new ArrayList<Transacao>();
	static ArrayList<Transacao> deposito = new ArrayList<Transacao>();
	static ArrayList<Transacao> pgto = new ArrayList<Transacao>();

	public void exibirHistorico() {

		System.out.println("\nHistorico de saque:\n");
		for (Transacao S : saque) {
			System.out.println(S);
		}

		System.out.println("-----------------------------------");

		System.out.println("\nHistorico de deposito:\n");
		for (Transacao D : deposito) {
			System.out.println(D);
		}

		System.out.println("-----------------------------------");

		System.out.println("\nHistorico de pagamento:\n");
		for (Transacao P : pgto) {
			System.out.println(P);
		}

	}

	public String toString() {
		if (this.codigo != "") {
			return "Valor >>> " + this.valor + "  Data: >>>  " + this.dia + "  Boleto: >>>" + this.codigo;
		} else {
			return "Valor >>> " + this.valor + "  Data: >>>  " + this.dia;
		}
	}

	public void historicoSaque(Transacao recebeSaque) {
		saque.add(recebeSaque);
	}

	public void historicoDeposito(Transacao recebeDeposito) {
		deposito.add(recebeDeposito);

	}

	public void historicoPGTO(Transacao recebePGTO) {
		pgto.add(recebePGTO);
	}

	public void recebeSaque(double valor, Date dia) {

		Transacao recebeSaque = new Transacao();

		recebeSaque.valor = valor;
		recebeSaque.dia = dia;

		historicoSaque(recebeSaque);

	}

	public void recebeDeposito(double valor, Date dia) {

		Transacao recebeDeposito = new Transacao();

		recebeDeposito.valor = valor;
		recebeDeposito.dia = dia;

		historicoDeposito(recebeDeposito);

	}

	public void recebePagamento(String codigo, double valor, Date dia) {
		Transacao recebePgto = new Transacao();

		recebePgto.valor = valor;
		recebePgto.dia = dia;
		recebePgto.codigo = codigo;

		historicoPGTO(recebePgto);

	}

}
