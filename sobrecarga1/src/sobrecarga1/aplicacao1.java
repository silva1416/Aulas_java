package sobrecarga1;

import java.util.Scanner;

public class aplicacao1 {
	//Sobrecarga de metodo � ultilizar o mesmo metodo como uma reciclagem, de varisas formas e jeitos

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		
		matematica matematica = new matematica();
		
		System.out.println("Somar Dois N�meros");
		System.out.println("Digite o prmeiro numero");
		int x = scanner. nextInt();
		
		System.out.println("Digite o segundo numero");
		int y = scanner. nextInt();
		
		
		int soma = matematica.somar(x, y);
		System.out.println("O resultado �: " + soma + "!!!");
		
		soma = matematica.somar(x, y, 5);
		System.out.println("O resultado �: " + soma + "!!!");
		
		double soma2= matematica.somar(x , y);
		System.out.println("O resultado �: " + soma2 + "!!!");

	}

	}


