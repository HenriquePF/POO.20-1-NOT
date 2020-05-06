import java.time.LocalDate;
import java.util.HashMap;

public class Agenda {
	private HashMap<LocalDate,DataAgenda> dias = new HashMap();
	
	public void addDataAgenda(DataAgenda dia) {
		if (dia == null) {
			throw new IllegalArgumentException("Data Agenda não pode ser nulo");
		}
		if (this.dias.containsKey(dia.getData())) {
			throw new IllegalArgumentException("Dia já existe na agenda.");			
		}
		this.dias.put(dia.getData(), dia);
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso menor = null;
		for (DataAgenda da: this.dias.values()) {
			for (Compromisso c: da.getCompromissos()) {
				if (menor == null || c.getTempo() < menor.getTempo()) {
					menor = c;
				}
			}
		}
		return menor;
	}
	
	public DataAgenda getDataAgenda(LocalDate data) {
		return this.dias.get(data);
	}
}
