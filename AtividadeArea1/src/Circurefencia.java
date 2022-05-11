
public class Circurefencia implements AreaCalculavel{
	double raio;
	
	@Override
	public void calcularArea() {
		System.out.println("A area da circuferencia é: " + 2 * Math.PI * raio );
		
	}

	
}
