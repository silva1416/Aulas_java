
public class Circurefencia implements AreaCalculavel{
	double raio;
	
	@Override
	public void calcularArea() {
		System.out.println("A area da circuferencia �: " + 2 * Math.PI * raio );
		
	}

	
}
