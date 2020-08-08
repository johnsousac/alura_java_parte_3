package java_parte_3;

public class TesteClasseControleBonificacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Funcionario f = new Funcionario();
		Funcionario g = new Gerente();
		Funcionario e = new EditorVideo();
		
//		f.setSalario(1600.0); // 160,00
		g.setSalario(5000.0); // 5500,00
		e.setSalario(3000.0); // 400,00
		
		ControleBonificacao c = new ControleBonificacao();
//		c.regitrarBonificacao(f);
		
//		System.out.println("Total bonificacao: " + c.getSomaBonificacao());
		
		c.regitrarBonificacao(g);
		
		System.out.println("Total bonificacao: " + c.getSomaBonificacao());
		
		c.regitrarBonificacao(e);
		
		System.out.println("Total bonificacao: " + c.getSomaBonificacao());
	}

}
