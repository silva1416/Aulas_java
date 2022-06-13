
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Sthe", 154887);
		Cliente cliente2 = new Cliente("Rafael", 2656 );
		
		Conta conta1 = new Conta(1000.0, cliente1, 100.0);
		Conta conta2 = new Conta(1500.0, cliente2, 200.0);

//-----------------------boolean---------------------------------------------------------------	
		if(cliente1.conta.sacar(100) == true) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saque n�o realizado porque seu saldo � insulficiente!!!!");
		}
		System.out.println("Seu saldo atual � de " + cliente1.getConta().getSaldo());
		
//-------------------------teste magic  numbers------------------------------------------
		switch (cliente1.getConta().sacarMN(100)) {
		  case 100: System.out.println("Saque realizado com sucesso!!");
		   break;
		  case 101: System.out.println("saque realizado com sucesso mas voce esta usando seu limite");
		   break;
		  case 102: System.out.println("Opera��o n�o realizada por falta de limite");
		   break;
		}
		//-------------------------teste exception------------------------------------------
		try {
			cliente1.getConta().sacarEX(1102);
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//vem automatico
			
			System.out.println("N�o foi possivel realizar a opera��o: " + e.getMessage());//mrnssagem tratada
		}
		
	}

}
