import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Sabonete sabonete1 = new Sabonete("Azul", "Flores");//Cria as caracteristicas do sabonete
		Sabonete sabonete2 = new Sabonete("Rosa", "Camomila");
		Sabonete sabonete3 = new Sabonete("Amarelo", "Baunilia");
		
		List<Sabonete> lista = new ArrayList<Sabonete>();//cria lista 
		
		lista.add(sabonete1);//add sabonete á lista
		lista.add(sabonete2);
		lista.add(sabonete3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida1.txt"))){//cria arquivo 
			for(Sabonete sabonete : lista )//NÃO COLOCAR PONTO E VIRGULA!!!
			 escrever.write(sabonete.toString());//mostra na lista
		
		}

	}

	}

