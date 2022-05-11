
public class Fusca implements Carro {

	@Override
	public void virarEsquerda() {
		System.out.println("Fusca virou a Esquerda");
	}
	@Override
	public void virarDireita() {
		System.out.println("Fusca virou a Direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fusca acelerou");
		
	}
	@Override
	public void abrirPorta() {
		System.out.println("Fusca abriu a porta");
		
	}

}
