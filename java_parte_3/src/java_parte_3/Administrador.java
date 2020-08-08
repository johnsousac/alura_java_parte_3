package java_parte_3;

public class Administrador extends Funcionario implements Autenticavel {
//	private int senha;
	private AutenticacaoUtil util;
	
	public Administrador() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50.0;
	}
	
//	@Override
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
	
//	@Override
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);	
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
}
