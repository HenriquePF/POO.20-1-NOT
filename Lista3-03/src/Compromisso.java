import java.time.LocalTime;

public class Compromisso {
	private LocalTime hora;
	private char prioridade;
	private String descricao;
	private int tempo;
	
	
	public Compromisso(LocalTime hora, String descricao, int tempo, char prioridade) {
		this.setHora(hora);
		this.setPrioridade(prioridade);
		this.setDescricao(descricao);
		this.setTempo(tempo);
	}
	
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public char getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(char prioridade) {
		if (prioridade == 'A'
			|| prioridade == 'N'
			|| prioridade == 'B') {
			this.prioridade = prioridade;
		}
		else
			throw new IllegalArgumentException("Prioridade deve ser A, N, ou B");
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		if (tempo > 0)
			this.tempo = tempo;
		else 
			throw new IllegalArgumentException("Tempo deve ter ao menos 1 min");
	}
	
	public String exibir() {
		return this.hora+" - "+this.tempo+" - "+this.descricao + "/ Prioridade:"+this.prioridade;
	}
}
