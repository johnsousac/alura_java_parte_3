package java_parte_3;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	public ContaPoupanca() {
		
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
}