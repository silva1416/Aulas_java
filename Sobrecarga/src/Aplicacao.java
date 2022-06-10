
public class Aplicacao {

	public static void main(String[] args) {
		
		Matematica matematica = new Matematica();//cria obj matematica
		
		int soma = matematica.somar(3, 4);//manda somar
		System.out.println("O resultado é: " + soma);//;mostra resultado

	}

}
