
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
	   
	   if (this.numFigurinhas < Qtdfig) {
		   System.out.println("N�o foi possivel completar sua a��o.");
		  // msg = false;
		   return false;
	
	   }else {
	   this.numFigurinhas -= Qtdfig;
	   pessoa.receber(Qtdfig);
	  // msg = true;
	   return true;
	   
	    }
        // return msg
         //no segundo caso tem retorno aqui embaixo 
   }
}
