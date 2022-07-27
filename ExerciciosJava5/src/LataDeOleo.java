import java.util.Scanner;

public class LataDeOleo {

	public static void main(String[] args) {

		// variaveis //
		double V = 3.14159; // valor de PI //
		double R; // raio //
		double A; // altura //
		double volume; // variavel que guardará o resultado //

		Scanner entrada = new Scanner(System.in);

		// é uma lata, entao os textos pedirao as medidas da mesma //

		System.out.println("Defina a altura em centimetros da lata:");
		A = entrada.nextDouble();

		System.out.println("Defina o comprimento do raio da circunferencia (raio = metade do diametro): ");
		R = entrada.nextDouble();

		// formula //
		volume = Math.pow(R, 2) * A * V; // o math.pow é o valor X elevado pelo valor Y

		System.out.println("Medida do raio em cm: " + R); // exibicao dos dados //
		System.out.println("Medida da altura em cm: " + A);
		System.out.println("O volume da lata de oleo e de: " + volume + " centimetros cubicos"); // resultado //

	}

}
