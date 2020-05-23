import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno {
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
	
	
}
