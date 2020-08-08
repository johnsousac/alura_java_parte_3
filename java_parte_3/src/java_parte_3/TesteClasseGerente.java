package java_parte_3;

public class TesteClasseGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		
		g.setSenha(1234);
		
		boolean autenticou = g.autentica(123);
		System.out.println("Autenticou: " + autenticou);
		
		g.setNome("John Castro de Sousa");
		g.setCpf("45444731878");
		g.setSalario(5600.0);
		
		System.out.println("Nome: " + g.getNome()
				+ "\nCPF: " + g.getCpf()
				+ "\nSalario: " + g.getSalario()
				+ "\nBonificacao: " + g.getBonificacao());
	}

}
