package java_parte_3;

public class CalcularImposto {
	private double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}