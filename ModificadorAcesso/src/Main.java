
public class Main {

	public static void main(String[] args) {

//craindo variavel de acesso a ContaBancaria
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		                                     //quando construido ja vai vir com o saldo de 3 reais  
   //tipo variavel   //endereço que da acesso a ContaBancaria   //consutor
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
		
		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
		
//		conta1.receber(100.8);
//		conta1.dar(50);
		System.out.println(conta1.saldo());
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.saldo());
		
		
	}

}
