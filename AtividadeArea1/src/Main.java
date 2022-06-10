
public class Main {

	public static void main(String[] args) {
		
		//cria obj
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 4;//coloca parametro
		quadrado.calcularArea();
		
		Retangulo retangulo = new Retangulo();
		retangulo.lado1 = 4;
		retangulo.lado2 = 2;
		retangulo.calcularArea();
		
		Circurefencia circuferencia = new Circurefencia();
		circuferencia.raio = 4;
		circuferencia.calcularArea();
		
		
		
	}

}
