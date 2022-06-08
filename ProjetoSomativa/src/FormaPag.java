
public enum FormaPag {
	A_VISTA(0.10),
	CARNE(0.10),
	CARTAO_CREDITO(0.05);
	
	double juros;

	private FormaPag(double juros) {
		this.juros = juros;
	}
	
	
}
