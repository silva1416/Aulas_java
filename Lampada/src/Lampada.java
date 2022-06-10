
public class Lampada {
     
	private boolean ligado;
	
	public Lampada () {
		ligado = true;//começa ligado
	}

	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	public void desligar (){//cria desligar
		ligado = false;
		imprimir();
		
	}
	public void ligar() {//cria ligar
		ligado = true;
		imprimir();
	}
	public void imprimir() {//cria imprimir
		
		if (ligado == true ) {
		System.out.println("Lampada Ligada");//mostrar quando ligar
	    }else {
			System.out.println("Lampada Desligada");//mostrar quando desligada
	    }
	
}   
}
