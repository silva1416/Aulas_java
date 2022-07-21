
public class Funcionario {
	private String nome;
	private int idd;
	private int cpf;

	

	public Funcionario(String nome, int idd, int cpf) {
		super();
		this.nome = nome;
		this.idd = idd;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cadastro: Nome=" + nome + ", Idade=" + idd + ", CPF=" + cpf + "\n";
	}


	
	
}