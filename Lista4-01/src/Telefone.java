import java.time.LocalDate;

public abstract class Telefone {
	private String numeroTelefone;
	private String nomeUsuario;
	protected LocalDate dataInstalacao;  // para exemplificar diferen�a entre protected e private
	private String enderecoInstalacao;
	
	public Telefone() {
		
	}
	
	public Telefone(String numero, String nomeUsuario, LocalDate data, String endereco) {
		super();
		this.setNumeroTelefone(numero);
		this.setNomeUsuario(nomeUsuario);
		this.setDataInstalacao(data);
		this.setEnderecoInstalacao(endereco);
	}

	public abstract double getValorBasico();
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		if (numeroTelefone == null || numeroTelefone.length() != 10) {
			throw new IllegalArgumentException("N�mero do telefone inv�lido");
		}
		this.numeroTelefone = numeroTelefone;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	public String getEnderecoInstalacao() {
		return enderecoInstalacao;
	}
	public void setEnderecoInstalacao(String enderecoInstalacao) {
		this.enderecoInstalacao = enderecoInstalacao;
	}
	
}
