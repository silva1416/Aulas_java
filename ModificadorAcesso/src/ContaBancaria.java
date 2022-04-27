
public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;

//métodos
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
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
