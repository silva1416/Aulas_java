import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		area area = new area();
		
		System.out.println("Calculo Area");
		System.out.println("Digite a base:");
		int b = scanner. nextInt();
		
		System.out.println("Digite a altura");
		int h = scanner. nextInt();
		
		double Areaf = area.area(b, h);
		System.out.println("A area da figura é de: " + Areaf);
		
		double Areaq = area.areaq(b);
		System.out.println("A area do quadrado é: " + Areaq);
		
		}

}
