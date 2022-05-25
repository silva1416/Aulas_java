import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//buff memoria temporaria
		//buffrred cria algo na memoria temporaria
		//lê e escreve no arquivo
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
		String line;
		String string = "";
		
		while ((line = reader.readLine())!= null) {
			string += line + "\n";
		}
		System.out.println(string);
	}
		}
		

	}


