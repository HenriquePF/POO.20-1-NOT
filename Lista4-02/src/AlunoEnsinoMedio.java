import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	private int ano;
	
	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoEnsinoMedio "+this.getNome());
		super.finalize();
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1 || ano > 3) {
			throw new IllegalArgumentException("Ano deve estar entre 1 e 3");
		}
		this.ano = ano;
	}


	@Override
	public String mostra() {
		return this.getNome()+ " está cursando o "+this.ano
				+"o ano do ensino médio e tem "
				+this.getIdade()+" anos.";
	}

}
