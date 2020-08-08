package java_parte_3;

public class Cliente implements Autenticavel {
	String nome;
	String profissao;
	private AutenticacaoUtil util;
	
	public Cliente() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public String getNome() {
//		return this.nome;
//	}
//	
//	public void setProfissao(String profissao) {
//		this.profissao = profissao;
//	}
//	
//	public String getProfissao() {
//		return this.profissao;
//	}
	
//	@Override
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//	
//	@Override
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}