package java_parte_3;

public class TesteClasseContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		
		cc.deposita(1600.0);
		
		System.out.println("Saldo: " + cc.saldo);
		
		cc.saca(100.0);
		
		System.out.println("Saldo: " + cc.saldo);
	}

}
