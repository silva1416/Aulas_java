
public class Lampada {
     
	private boolean ligado;
	
	public Lampada () {
		ligado = true;
	}

	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	public void desligar (){
		ligado = false;
		imprimir();
		
	}
	public void ligar() {
		ligado = true;
		imprimir();
	}
	public void imprimir() {
		
		if (ligado == true ) {
		System.out.println("Lampada Ligada");
	    }else {
			System.out.println("Lampada Desligada");
	    }
	
}   
}
