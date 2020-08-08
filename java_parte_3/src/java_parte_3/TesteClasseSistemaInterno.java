package java_parte_3;

public class TesteClasseSistemaInterno {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador a = new Administrador();
		a.setSenha(2222);
		
//		EditorVideo e = new EditorVideo();
//		e.setSenha(222);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		
		SistemaInterno s = new SistemaInterno();
		s.autentica(g);
		s.autentica(a);
//		s.autentica(e);
		s.autentica(c);
	}
}