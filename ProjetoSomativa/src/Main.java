import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Professor professor1= new Professor( "rafael", 4755566, 1200);
		Professor professor2= new Professor( "ailton", 4542135, 1100);
		
		Curso curso1 = new Curso("mecanica", 200, 700, professor1);
		Curso curso2 = new Curso("eletronica", 300, 600 , professor2);
		
		Aluno aluno1 = new Aluno("Joao", 45454522, 0, curso1,FormaPag.A_VISTA);
		Aluno aluno2 = new Aluno("Fernando", 6526532, 0, curso1,FormaPag.CARNE);
		Aluno aluno3 = new Aluno("Raimundo", 656522, 0, curso2, FormaPag.A_VISTA);
		Aluno aluno4 = new Aluno("Ryan", 2142323, 0, curso2, FormaPag.CARTAO_CREDITO);
		
List<Aluno> lista = new ArrayList<Aluno>();//cria lista 
		
		lista.add(aluno1);//add sabonete á lista
		lista.add(aluno2);
		lista.add(aluno3);
		lista.add(aluno4);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("alunos.txt"))){//cria arquivo 
			for(Aluno aluno : lista )//NÃO COLOCAR PONTO E VIRGULA!!!
			 escrever.write(aluno.toString());//mostra na lista
	}
	

}
}
