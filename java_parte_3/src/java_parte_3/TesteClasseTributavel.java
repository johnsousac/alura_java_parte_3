package java_parte_3;

public class TesteClasseTributavel {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente();
		c.deposita(1500.0);
		
		SeguroVida s = new SeguroVida();
		
		CalcularImposto ci = new CalcularImposto();
		ci.registra(c);
		ci.registra(s);
		
		System.out.println("Imposto: " + ci.getTotalImposto());
	}
}
