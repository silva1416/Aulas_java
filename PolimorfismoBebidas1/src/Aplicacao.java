
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();//cria preparador

		LeiteQuente leitequente = new LeiteQuente();//cria leite quente
		preparador.prepararBebida(leitequente);//manda preparar leite quente
		
		Refrigerante refrigerante = new Refrigerante();//cria refrigerante
		preparador.prepararBebida(refrigerante);//manda preparar refrigerante
		

	}

}
