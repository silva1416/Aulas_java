package heranca;

public class Main {

	public static void main(String[] args) {
//criando obj veiculo	
	 veiculo veiculo = new veiculo();
	 
	 veiculo.setMarca("honda");
	 veiculo.setModelo("city");
	 veiculo.setAno(2013);
	 
	 veiculo.imprimir();
	 veiculo.buzinar();

//criando obj carro
	 carro carro = new carro();
	 
	 carro.setMarca("honda");
     carro.setModelo("civic");
     carro.setAno(2017);
     carro.setQuatroPortas(true);
     
    System.out.println();
     
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
     moto.empinar();
     
	}
	
}
