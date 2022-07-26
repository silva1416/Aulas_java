import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario(); 
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(scanner.next());
		
		System.out.println("Digite o salario do funcionario: ");
		double x = scanner.nextInt();
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario2.setNome(scanner.next());
		
		System.out.println("Digite o salario do funcionario: ");
		double y = scanner.nextInt();
		
		double med = funcionario.med(x, y);
		double med1 = funcionario.med1(med);
		
		System.out.println("A media salarial eh de " + med1);
		

		}
	}


