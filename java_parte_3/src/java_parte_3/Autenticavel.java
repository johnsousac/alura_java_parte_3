package java_parte_3;

public abstract interface Autenticavel {
//	private int senha;
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
}
