package heranca;

public class Main {

	public static void main(String[] args) {
//criando obj veiculo	
	 veiculo veiculo = new veiculo();//instanciando
	 
	 veiculo.setMarca("honda");//colocando marca
	 veiculo.setModelo("city");//colocando modelo
	 veiculo.setAno(2013);//colocando ano
	 
	 veiculo.imprimir();//mostrar na tela
	 veiculo.buzinar();//manda buzinar

//criando obj carro
	 carro carro = new carro();//instancia carro
	 
	 carro.setMarca("honda");
     carro.setModelo("civic");
     carro.setAno(2017);
     carro.setQuatroPortas(true);//quantidade de portas
     
    System.out.println();//manda mostrar
     
     carro.imprimir();
     carro.buzinar();
//criando obj caminhao    
     caminhao caminhao = new caminhao();
     
     caminhao.setMarca("Scania");
     caminhao.setModelo("xj");
     caminhao.setAno(2011);
     
     System.out.println();
     
     caminhao.imprimir();
     caminhao.buzinar();
  //criando obj moto
     moto moto = new moto();
     
     moto.setMarca("honda");
     moto.setModelo("XT");
     moto.setAno(2021);
     
     System.out.println();
     
     moto.imprimir();
     moto.buzinar();
     moto.empinar();//empina
     
	}
	
}
