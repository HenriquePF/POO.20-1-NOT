import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{
	private FormaDeIngresso formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, LocalDate dataNascimento, 
								FormaDeIngresso forma, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(forma);
		this.setCurso(curso);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoUniversitario "+this.getNome());
		super.finalize();
	}
	
	/*
	public String getFormaIngresso() {
		switch (this.formaIngresso) {
		case 'V': return "Vestibular";
		case 'E': return "ENEM";		
		case 'S': return "Seletivo especial";		
		case 'T': return "Transferência externa";
		case 'I': return "Transferência interna";
		default: return "Indeterminado";
		}
    }

    public void setFormaIngresso(char formaIngresso) {
    	String v = String.valueOf(formaIngresso);
        if ("VESTI".contains(v)) {
        	this.formaIngresso = formaIngresso;
        }
        else
        	throw new IllegalArgumentException("Forma de ingresso só pode ser V|E|S|T|I");
    }
*/
	
	public String getFormaIngresso() {
		return formaIngresso.getDescricao();
	}
	public void setFormaIngresso(FormaDeIngresso formaIngresso) {
			this.formaIngresso = formaIngresso;
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
