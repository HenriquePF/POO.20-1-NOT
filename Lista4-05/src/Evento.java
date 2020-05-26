import java.time.LocalDate;

public class Evento {
	private String titulo;
	private float valor;
	private LocalDate data;
	private Avaliacao avaliacaoRealizada;
	
	public Evento(String titulo, float valor, LocalDate data) {
		super();
		this.setTitulo(titulo);
		this.setValor(valor);
		this.setData(data);
	}
	
	public boolean isAvaliado() {
		return avaliacaoRealizada != null;
	}
	
	
	
	@Override
	public String toString() {
		return titulo + " / " + data;
	}

	public String exibir() {
		// Evento: Teatro às 18h, no dia 10/09/2019, ingressos a R$ 20,00, teve 1500 pagantes que acharam o evento Bom nível.
		String str = "Evento: "+this.getTitulo()+", no dia "+this.getData()
					 + ", ingressos a R$"+this.getValor();
		if (this.avaliacaoRealizada == null) {
			str += ". Ainda não avaliado.";
		}
		else {
			str += "teve "+this.avaliacaoRealizada.getQtdPagantes()
					+" pagantes que acharam o evento "
					+this.avaliacaoRealizada.getOpiniaoGeral();
		}
		return str;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Avaliacao getAvaliacaoRealizada() {
		return avaliacaoRealizada;
	}
	public void setAvaliacaoRealizada(Avaliacao avaliacaoRealizada) {
		this.avaliacaoRealizada = avaliacaoRealizada;
	}
	
	
	
}
