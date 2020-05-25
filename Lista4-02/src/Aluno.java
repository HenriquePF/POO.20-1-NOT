import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno implements Comparable<Aluno> {
	private String nome;
	private LocalDate dataNascimento;
	
	// construtor
	public Aluno(String nome, LocalDate dataNascimento) {
		super();
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}
	
	// destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Passou pelo ALUNO "+this.nome);
		super.finalize();
	}
	
	
	// métodos
	public abstract String mostra();


	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
	    Period periodo = Period.between(this.dataNascimento, dataAtual);
		return periodo.getYears();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/*
	public int compareTo(Aluno outro) {
	// se a ordem fosse por idade (crescente)
		return this.idade - outro.getIdade();
		
		if (this.getIdade() > outro.getIdade()) {
			return 10;
		}
		if (this.getIdade() == outro.getIdade()) {
			return 0;
		}
		return -10;
		
	}
	*/
	
	
	public int compareTo(Aluno outro) {
		// ordem alfabética de nome
		return this.nome.compareTo(outro.getNome());
		/*
		if (this.nome.compareTo(outro.getNome()) > 0 ) {
			return 10;
		}
		else if (this.nome.compareTo(outro.getNome()) == 0) {
			return 0;
		}
		else {
			return -10;
		}
		*/
	}
}
