package java_parte_3;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
//	private int senha;
	
	public Funcionario() {
		
	}
	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//	
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public abstract double getBonificacao();
}