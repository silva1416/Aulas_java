import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import Pessoa.Sexo;

public class main {
//	private enum sexo {
//		MASCULINO,FEMININO;
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List lista = new ArrayList();// cria lista e array

		for (int x = 0; x <= 3; x++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());
		
			
			System.out.println("Digite seu nome: ");
			pessoa.setNome(entrada.next()); 

			System.out.println("Digite sua idade: ");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("Genero: 1-Feminino 2- Masculino");
			
			
			System.out.println("Dados do endereço");
			System.out.println("Digite o nome do bairro: ");
			pessoa.getEndereco().setBairro(entrada.next()); ;

			System.out.println("Digite o nome da rua: ");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Digite o numero da sua casa: ");
			pessoa.getEndereco().setN(entrada.nextInt());

			
		}

	}
}
