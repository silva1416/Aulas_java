
public class Main {

	public static void main(String[] args) {
		
		ConanBancaria conta1 = new ConanBancaria(true, 200, 213785);//n conta saldo e situa��o
		ConanBancaria conta2 = new ConanBancaria(true, 1000, 3897);
		
		conta1.Receber(1000);//valor a receber
		conta2.Receber(600);
		
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n%n",conta2.Ver());
		conta1.Dar(400);//valor dar
		conta2.Receber(400);//valor receber
		
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n%n",conta2.Ver());
		conta1.Dar(600);
		conta2.Receber(600);
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n",conta2.Ver());
		
		Cliente cliente1 = new Cliente ();//cria��o do cliente 1
		cliente1.setNome("Sara");
		cliente1.setCpf(1215454);
		cliente1.setNumConta(15554);
		
		System.out.println(cliente1.getNome());//mostrar nome,cpf e num da conta
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1.toString());
		

		Cliente cliente2 = new Cliente ();
		cliente2.setNome("Sara");
		cliente2.setCpf(1215454);
		cliente2.setNumConta(15554);
		
		System.out.println(cliente2);
		
		if(cliente1.getNome() == cliente2.getNome()) {
			System.out.println("Os nomes s�o iguais");
		}
		else {
			System.out.println("Os nomes s�o diferentes");  
		
		}
		if(cliente1 == cliente2 ) {
			System.out.println("Os nomes s�o iguais");
		}
		else {
			System.out.println("Os nomes s�o diferentes");  
		
		}
		
		if(cliente1.equals(cliente2)) {
			System.out.println("Os nomes s�o iguais");
		}
		else
		{	System.out.println("Os nomes s�o diferentes");  
			
		}
		
		
		
	}

}