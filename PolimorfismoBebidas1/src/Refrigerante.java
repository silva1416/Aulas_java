
public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("Refrigerante", false);//o obj refrgerante e se precisa aquecer como não, é false
	}
//implemento
	@Override
	public void preparar() {
			super.preparar();//chamando o que tem na super classe
		    System.out.println("Colocando Gelo no copo");
		    System.out.println("Colocando o Refrigerante");
	}
	
	
	
	
}
