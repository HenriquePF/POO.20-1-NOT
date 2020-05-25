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
		case 'T': return "Transfer�ncia externa";
		case 'I': return "Transfer�ncia interna";
		default: return "Indeterminado";
		}
    }

    public void setFormaIngresso(char formaIngresso) {
    	String v = String.valueOf(formaIngresso);
        if ("VESTI".contains(v)) {
        	this.formaIngresso = formaIngresso;
        }
        else
        	throw new IllegalArgumentException("Forma de ingresso s� pode ser V|E|S|T|I");
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
		// Jo�o Carlos � aluno universit�rio do curso de SIS � Sistemas de Informa��o, ingressando por ENEM.
		return this.getNome()+ " � aluno universit�rio do curso de "
				+this.curso.getSigla()+" - "+this.curso.getNome()
				+", ingressando por "
				+this.getFormaIngresso();
	}
}
