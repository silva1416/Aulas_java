
public class Rota {
	
	public void ir(Automovel automovel) {//criando variavel automovel dentro da classe automovel
	
		automovel.virarDireita();//mandando automovel (idependente de qual carro é) agir
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
	}
	
}
