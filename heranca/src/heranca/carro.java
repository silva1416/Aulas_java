package heranca;

public class carro extends veiculo {
//extends e o nome da classe que herda
	private boolean quatroPortas;
	
@Override
	public void imprimir() {
		// Esta subscrevendo
	    System.out.println("Tem quatro portas?: " + quatroPortas);
		super.imprimir();
	}

	//get set
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	
}

