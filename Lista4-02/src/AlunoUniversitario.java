import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{
	private char formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, LocalDate dataNascimento, 
								char forma, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(forma);
		this.setCurso(curso);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoUniversitario "+this.getNome());
		super.finalize();
	}
	
	public char getFormaIngresso() {
		return formaIngresso;
	}
	public void setFormaIngresso(char formaIngresso) {
		if (formaIngresso == 'V'
			|| formaIngresso == 'E'
			|| formaIngresso == 'S'
			|| formaIngresso == 'T'
			|| formaIngresso == 'I') {
			this.formaIngresso = formaIngresso;
		}
		else {
			throw new IllegalArgumentException("Ingresso: V,E,S,T,I");
		}
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String mostra() {
		// João Carlos é aluno universitário do curso de SIS – Sistemas de Informação, ingressando por ENEM.
		return this.getNome()+ " é aluno universitário do curso de "
				+this.curso.getSigla()+" - "+this.curso.getNome()
				+", ingressando por "
				+this.getFormaIngresso();
	}
}
