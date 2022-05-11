
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota();//criando variavel rota em Rota
		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		
//		rota.ir(ferrari);//pede qual autuomovel é
//		rota.ir(fusca);
		
		//ou pode ser feito assim:
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
//		automovel = new Fusca();
//		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(ferrari);
		vendedor.mostrarPreco(apartamento);
		
	}

}
