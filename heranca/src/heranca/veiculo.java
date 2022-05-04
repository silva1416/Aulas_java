package heranca;

public class veiculo {
//super classe/classe pai
	//protected é ultilizado 
	private String nome;
	protected String marca;
	protected String modelo;
	protected int ano;

//metodos
	public void buzinar() {
		System.out.println("BI,BI");
	}
    public void imprimir() {
    	System.out.println("Marca:" + marca);
    	System.out.println("Modelo:" + modelo);
    	System.out.println("Ano:" + ano);
    	
    	
    }
    
	
	
	
	
//get e set	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
}

