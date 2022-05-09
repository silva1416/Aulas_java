
public class Preparador {
	//classe de passagem 
	public void prepararBebida(Bebida bebida) {
		
		System.out.println("Preparando Bebida: " + bebida.getNome() );
		
		bebida.preparar();//mandando preparar
		
		if (bebida.isAquecer()) {//Se bebida fro true para aquecer
			System.out.println("Aquecendo Bebida: " + bebida.getNome());//aquece
		}
			System.out.println("Bebida preparada com sucesso!! \n");//se não so faz
	}
	
}
