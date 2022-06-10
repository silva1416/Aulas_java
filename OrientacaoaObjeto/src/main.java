
public class main {

	public static void main(String[] args) {
//Criação da 1 pessoa
 pessoa pessoa1= new pessoa ();
		 
		 pessoa1.nome = "Sthe";//coloca o nome
		 pessoa1.numFigurinhas = 4;//coloca o numero de figu

//Metodo receber
		 pessoa1.receber(0);//quanto pessoa um vai receber
		 
		 System.out.println(pessoa1.nome);//mostrar
		 System.out.println(pessoa1.numFigurinhas);

//Criação da 2 pessoa
 pessoa pessoa2 = new pessoa();
 
        pessoa2.nome = "Gislene";
        pessoa2.numFigurinhas = 5;
        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.numFigurinhas);
        
  //metodo dar 
        boolean retorno = pessoa1.dar(2,pessoa2);
        if(retorno == true) {
        System.out.println("Depois");
        
 //mostrar quanto tinha antes e depois de dar
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.numFigurinhas);
        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.numFigurinhas);
    
	   }
	}
}
