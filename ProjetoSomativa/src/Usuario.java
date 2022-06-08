
public class Usuario {
	String nome;
	int cpf;
	
	public Usuario(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + "]";
	}

	
	
	
}
