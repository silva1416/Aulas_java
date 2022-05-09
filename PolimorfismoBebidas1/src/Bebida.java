
public class Bebida {
	private String nome;
	private boolean aquecer;

public Bebida(String nome, boolean aquecer) {
	super();
	this.nome = nome;
	this.aquecer = aquecer;
}
//metodos
	public void preparar() {
		System.out.println("Pegando copo");//para não repetir o syso no metodo preparar
	}
//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAquecer() {
		return aquecer;
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
	
}
