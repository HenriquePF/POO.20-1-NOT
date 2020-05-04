import java.util.ArrayList;
import java.util.HashMap;

public class Camara {
	private HashMap<Integer, Partido> partidos = new HashMap<>();

	public void addPartido(Partido p) {
		if (p == null) {
			throw new IllegalArgumentException("Partido não pode ser nulo.");
		}
		if (this.partidos.containsKey(p.getNumero())) {
			throw new IllegalArgumentException("Já há partido com este número.");
		}
		this.partidos.put(p.getNumero(), p);
	}

    public Partido getPartido(int numero) {
        return this.partidos.get(numero);
    }
	
	public int getTotalProjApres() {
		int total = 0;
		for (Partido p : this.partidos.values()) {
			total += p.getQtdProjApres();
		}
		return total;
	}

	public int getTotalProjAprov() {
		int total = 0;
		for (Partido p : this.partidos.values()) {
			total += p.getQtdProjApres();
		}
		return total;
	}

	public Vereador getVereadorMenorDesempenho() {
		// primeira estratégia para descobrir um determinado vereador
		Vereador piorDeTodos = null;
		for (Partido p : this.partidos.values()) {
			Vereador ruim = p.getVereadorMenorDesempenho();
			if (piorDeTodos == null || (ruim != null && ruim.getDesempenho() < piorDeTodos.getDesempenho())) {
				piorDeTodos = ruim;
			}
		}
		return piorDeTodos;
	}

	public Vereador getVereadorMaisProjAprov() {
		// outra estratégia para descobrir um determinado vereador
		Vereador maior = null;
		for (Partido p : this.partidos.values()) {
			ArrayList<Vereador> temporaria = p.getVereadores();
			for (Vereador v : temporaria) {
				if (maior == null || v.getQtdProjAprov() > maior.getQtdProjAprov()) {
					maior = v;
				}
			}
		}
		return maior;
	}

	public double getMediaDesempenho() {
		double total = 0;
		int contaVereadores = 0;
		for (Partido p : this.partidos.values()) {
			total += (p.getMediaDesempenho() * p.getQtdVereadores());
			contaVereadores += p.getQtdVereadores();
		}
		return total / contaVereadores;
	}

	public ArrayList<Vereador> getVereadoresAcimaMedia() {
		ArrayList<Vereador> retorno = new ArrayList<>();
		double media = this.getMediaDesempenho();
		for (Partido p : this.partidos.values()) {
			ArrayList<Vereador> temporaria = p.getVereadores();
			for (Vereador v : temporaria) {
				if (v.getDesempenho() > media) {
					retorno.add(v);
				}
			}
		}
		return retorno;
	}
}
