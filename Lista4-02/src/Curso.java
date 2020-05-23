
public class Curso {
	private String sigla;
	private String nome;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		if (sigla == null || sigla.length()!=3) {
			throw new IllegalArgumentException("Sigla inválida");
		}
		this.sigla = sigla.toUpperCase();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
