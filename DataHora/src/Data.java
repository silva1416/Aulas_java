
public class Data {
//constantes
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	//cria var.
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	//Construtor que recebe dia, mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia= dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Construtor completo, que recebe inromações de data e horário
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		//Chama outro construtor da classe
		this(dia, mes, ano);
		
		this.hora= hora;
		this.minuto= minuto;
		this.segundo = segundo;
	}
	//imprime a data/hora formatada (de acordo com o ormato especificado)
	public void imprimir(int formato) {
		//monta a string de impressão de data
		String data = dia + "/" + mes + ano;
		
		if (hora == -1) {
			//se hora for -1, significa que os dados de horarios não foram passado no construtor.
			//entao exibe só a data.
		}else {
			//monta parte da string do horario (deixa a hora de fora por enquanto)
			String horario = ":" + minuto + ":" + segundo;
			
		if(formato == FORMATO_24H) {
			//Se o formato 24 concatena a hora do inicio da string (p atributo ja foi
			//fornecido em formato 24h
			horario = hora + horario;
		}else {
			//se o formato for 12h
			if (hora == 0) {
				horario = 12 + horario;
				horario += "AM";
						
			}else if (hora >= 12){
				// Se hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter 
				// a hora no formato 12h, e concatena o "PM" no fim
				horario = (hora - 12) + horario;
				horario += " PM";
			}else {
				//se a hora for menor que 12, simplesmente utiliza a propria hora e
				//o am no fim
				horario = hora + horario;
				horario += "AM";
			}
		}
		//IMPRIME A DATA/HORA FORMATADA
		System.out.println(data + "" + horario);
		}
	}
	//metodos getters

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

}
