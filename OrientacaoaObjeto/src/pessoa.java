
public class pessoa {
//Criando os dados/atributos
	String nome;
	int numFigurinhas;

//Metodos
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
		
	}
//metodos
//assinatura do metodo(tipo de retorno, metodo , 
   boolean dar(int Qtdfig, pessoa pessoa) {
	   
	   boolean msg;
	   
	   if (this.numFigurinhas < Qtdfig) {
		   System.out.println("Não foi possivel completar sua ação.");
		  // msg = false;
		   return false;
	
	   }else {
	   this.numFigurinhas -= numFigurinhas;
	   pessoa.receber(numFigurinhas);
	  // msg = true;
	   return true;
	   
	    }
        // return msg;
         //no segundo caso tem retorno aqui embaixo 
   }
}
