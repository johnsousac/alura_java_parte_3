package java_parte_3;

public class ControleBonificacao {
	private double soma;
	
	public void regitrarBonificacao(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
	
	public double getSomaBonificacao() {
		return this.soma;
	}
}