import java.time.LocalDate;

public class Parecer {
	private String nomeParecerista;
	private LocalDate data;
	private String conteudo;
	
	public Parecer(String nomeParecerista, LocalDate data, String conteudo) {
		this.setNomeParecerista(nomeParecerista);
		this.setData(data);
		this.setConteudo(conteudo);
	}
	
	public String getNomeParecerista() {
		return nomeParecerista;
	}
	public void setNomeParecerista(String nomeParecerista) {
		if (nomeParecerista != null && !nomeParecerista.isEmpty()) {
			this.nomeParecerista = nomeParecerista;
		}
		else {
			throw new IllegalArgumentException("Nome do parecerista inválido");
		}
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
