package fundamentos;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static int main(String[] args) {
			Funcionario funcionario1 = new Funcionario("sthe", 17, 123456, 1500);
			Funcionario funcionario2 = new Funcionario("lulu", 17, 789456, 2000);
			
			List lista = new ArrayList();// cria lista e array
			lista.add(funcionario1);
			lista.add(funcionario2);
			
			 System.out.println(lista);
			
			int x = 1500;
			int y = 2000;
			
			return x - y;
			
			
		}
	

	}


