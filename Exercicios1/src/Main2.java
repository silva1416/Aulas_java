import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Math1 math = new Math1();
		
		System.out.println("Digite o valor:");
		double x = scanner.nextDouble();
		System.out.println("Digite o desconto:");
		double y = scanner.nextDouble();

		double z = math.desc(x, y);
		System.out.println("Desconto eh de: R$" + z + " reais");

	}

}
