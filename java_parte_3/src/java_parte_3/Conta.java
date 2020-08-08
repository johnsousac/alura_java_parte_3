package java_parte_3;

public abstract class Conta {
	protected double saldo;
	Cliente titular;
	int numero;
	int agencia;
	private static int totalContasCriadas;
	
	public Conta() {
		totalizarContasCriadas();
	}
	
	public Conta(int numero, int agencia) {
		if((numero < 0) || (agencia < 0)) {
			System.out.println("Numero ou agencia não podem ser negativos!");
		} else {
			this.numero = numero;
			this.agencia = agencia;
			totalizarContasCriadas();
			System.out.println("Conta criada com sucesso!");
		}
	}
	
	private void totalizarContasCriadas() {
		totalContasCriadas++;
	}
	
	public abstract void deposita(double valor);
	
	public boolean transfere(Conta conta, double valor) {
		if(saca(valor)) {
			conta.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public static int getContaCriadas() {
		return Conta.totalContasCriadas;
	}
}