
public class Conta {
	private double saldo;
	private double limite;
	
//-----------------------boolean---------------------------------------------------------------	
	public boolean sacar(double valor) {
		if(this.saldo<valor) {
			return false;
		}
		this.saldo-=valor;
		return true;
	}
	public boolean transferir(Cliente cliente, double valor) {//metodo transferir
		if(this.saldo<valor) {//se for menor que o saldo
			return false;//retorna falso
		}
		this.saldo-=valor;//tira e mostra o novo saldo
		cliente.getConta().depositar(valor);//com o metodo depositar
		return true;//retorno true
	}
	
//-----------------------magic numbers---------------------------------------------------------
	public int sacarMN(double valor) {
		if((this.saldo < valor) &&( this.saldo > limite*-1) ){
			return 101;//se ok msotra 100
		}
		else if(this.saldo >=limite*-1) {
			return 102;
	}
		return 100;
	}
	
	
	public int transferirMN(Cliente cliente, double valor) {
		if((this.saldo < valor) &&( this.saldo > limite*-1) ){
			this.saldo-=valor;
			return 101;//se ok msotra 100
		}
		else if(this.saldo >=limite*-1) {
			return 102;
	}
		this.saldo-=valor;
		cliente.getConta().depositar(valor);
		return 100;
	}
	
	
	
	//-----------------------teste com exception---------------------------------------------------------
	
	public void sacarEX(double valor) throws ContaException {
		if(this.saldo<valor) {
			throw new ContaException("Saldo insuficiente", null);
		}
		else if((this.saldo - valor) < limite * -1){
			throw new ContaException("Limite insuficiente", null);
		}
		this.saldo-=valor;
	}
	
	//----------------------------------------------------------------------------------------------------
	public void depositar (double valor) {
		this.saldo+=valor;
	}
	//-----------------------------construtor-------------------------
	public Conta(double saldo, Cliente cliente, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}
	//------------------------get/set---------------------------------
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	


	
	
	
}
