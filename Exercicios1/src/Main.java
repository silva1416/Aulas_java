
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//receber cadastro de 2 funcionarios de uma empresa de alimentos e calcule a diferença em reais do salario de cada um  

		Funcionario funcionario = new Funcionario("sthe", 17, 215);
		
		Math math = new Math();

		Funcionario funcionario2 = new Funcionario("lulu", 15, 589);

		List<Funcionario> lista = new ArrayList<Funcionario>();
		Scanner scanner = new Scanner(System.in);
		lista.add(funcionario);
		lista.add(funcionario2);

		System.out.println(lista);
		
		
		
		System.out.println("Digite o salario da 1a pessoa:");
		double x = scanner.nextDouble();
		System.out.println("Digite o salario da 2a pessoa:");
		double y = scanner.nextDouble();

		double z = math.sub(x, y);
		System.out.println("A diferenca salarial eh de " + z + " reais");
		

	}

}