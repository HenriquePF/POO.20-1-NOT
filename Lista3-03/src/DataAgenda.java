import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private HashMap<LocalTime,Compromisso> compromissos = new HashMap();
	
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}

	public void addCompromisso(Compromisso c) {
		if (c == null) {
			throw new IllegalArgumentException("Compromisso não pode ser nulo");
		}
		if (this.compromissos.containsKey(c.getHora())) {
			throw new IllegalArgumentException("Hora já ocupada"+c.getHora());
		}
		this.compromissos.put(c.getHora(),c);
	}
	
	public int getTempoMedio() {
		if (this.compromissos.isEmpty()) {
			return 0;
		}
		int total = 0;
		for (Compromisso c: this.compromissos.values()) {
			total += c.getTempo();
		}
		return total/this.compromissos.size();
	}
	
	public int getQtdCompromissosPrioridade(char prioridade) {
		int total = 0;
		for (Compromisso c: this.compromissos.values()) {
			if (c.getPrioridade() == prioridade) {
				total++;
			}
		}
		return total;
	}	
	
	public ArrayList getCompromissosPrioridade(char prioridade) {
		ArrayList<Compromisso> retorno = new ArrayList();
		for (Compromisso c: this.compromissos.values()) {
			if (c.getPrioridade() == prioridade) {
				retorno.add(c);
			}
		}
		return retorno;
	}	
	
	public ArrayList<Compromisso> getCompromissos() {
		return new ArrayList(this.compromissos.values());
	}
}
