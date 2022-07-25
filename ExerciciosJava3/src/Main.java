import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario(); 
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(scanner.next());
		
		System.out.println("Digite o salario do funcionario: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario2.setNome(scanner.next());
		
		System.out.println("Digite o salario do funcionario: ");
		int y = scanner.nextInt();
		
		int med = funcionario.med(x, y);
		System.out.println("A media salarial eh de " + med);
		

		}
	}


