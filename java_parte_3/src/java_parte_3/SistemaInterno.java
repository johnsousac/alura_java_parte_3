package java_parte_3;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel f) {
		if(f.autentica(this.senha)) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
//	public void autentica(Administrador a) {
//		if(a.autentica(this.senha)) {
//			System.out.println("Pode entrar no sistema!");
//		} else {
//			System.out.println("Não pode entrar no sistema!");
//		}
//	}
}
