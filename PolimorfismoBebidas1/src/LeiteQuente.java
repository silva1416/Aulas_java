
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}
//implemento
	@Override
	public void preparar() {
		super.preparar();//chamando o que tem na super classe
		System.out.println("Colocando leite no Copo");
	}
	

	
	}
	


