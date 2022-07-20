package fundamentos;

public class Funcionario {
	private String nome;
	private int idade;
	private int cpf;
	private float salario;
	
	
	
	public Funcionario(String nome, int idade, int cpf, float salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Funcionario: nome: " + nome + " ,idade:" + idade + " ,cpf:" + cpf + " salario:" + salario + "]"  + " \n"  ;
	}
	
	
	

	
	
	
	
	
	
}
