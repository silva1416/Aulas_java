import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		//cria area
		area area = new area();
		
		System.out.println("Calculo Area");
		System.out.println("Digite a base:");
		int b = scanner. nextInt();//guarda na var
		
		System.out.println("Digite a altura");
		int h = scanner. nextInt();//guarda na var.
		
		double Areaf = area.area(b, h);//calcula
		System.out.println("A area da figura é de: " + Areaf);//mostra
		
		double Areaq = area.areaq(b);
		System.out.println("A area do quadrado é: " + Areaq);
		
		}

}
