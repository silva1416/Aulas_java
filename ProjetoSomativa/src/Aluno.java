
public class Aluno extends Usuario {
	double ValorPagarCurso;
	Curso curso;
	FormaPag formaPag;
	
	public Aluno(String nome, int cpf, double valorPagarCurso, Curso curso, FormaPag formaPag) {
		super(nome, cpf);
		ValorPagarCurso = valorPagarCurso;
		this.curso = curso;
		this.formaPag = formaPag;
	}

	public double getValorPagarCurso() {
		return ValorPagarCurso;
	}

	public void setValorPagarCurso(double valorPagarCurso) {
		ValorPagarCurso = valorPagarCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	@Override
	public String toString() {
		return "Aluno [ValorPagarCurso=" + ValorPagarCurso + ", curso=" + curso + ", formaPag=" + formaPag + "]";
	}

	
	
	
	
	
	
	
	
}
