
public class Ferrari implements  Automovel, ItemCaro{

	//metodos
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari Virou a Esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari Virou a Direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerou ");
		
	}

	@Override
	public double getPreco() {// TODO Auto-generated method stub
		return 100000;
	}

}
