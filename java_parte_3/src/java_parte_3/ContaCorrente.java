package java_parte_3;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	public ContaCorrente() {
		
	}
	
	@Override
	public double getValorImposto() {
		return saldo * 0.01;
	}
	
	@Override
	public boolean saca(double valor) {
		if(super.saca(valor)) {
			this.saldo -= (valor + 0.20);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
}