
public class ContaBancaria {
	
	private int numConta;//variaveis
	private boolean ativo;
	private double saldo;

//métodos
	public ContaBancaria() {
		ativo = true;//se esta ativo
		saldo = 1.0;//o tano de saldo da conta
	}
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}
	public void receber (double valor) {
		saldo += valor; 	
		//soma no valor do saldo que ja havia antes
	}
	
	public double saldo() {
		return saldo;
	}
	
	public void dar(double valor) {
		if (saldo >= valor )
		   saldo -= valor;
	}
	
	
}
