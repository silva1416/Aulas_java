
public class Curso {
	String titulo;
	double qtdHorasCurso;
	double valorHoraCurso;
	Professor professor;
	
	public Curso(String titulo, double qtdHorasCurso, double valorHoraCurso, Professor professor) {
		super();
		this.titulo = titulo;
		this.qtdHorasCurso = qtdHorasCurso;
		this.valorHoraCurso = valorHoraCurso;
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", qtdHorasCurso=" + qtdHorasCurso + ", valorHoraCurso=" + valorHoraCurso
				+ ", professor=" + professor + "]";
	}
	
	
	
	
	
}
