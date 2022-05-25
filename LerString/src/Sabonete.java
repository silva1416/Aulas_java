
public class Sabonete {
	String cor;
	String cheiro;


	@Override
	public String toString() {
		return "Sabonete: cor=" + cor + ", cheiro=" + cheiro + "]\n";
	}
	public Sabonete(String cor, String cheiro) {
		super();
		this.cor = cor;
		this.cheiro = cheiro;
	}
	public Sabonete(String texto) {
		
		String [] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}

}
