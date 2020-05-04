import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero < 10 || numero > 99) {
			throw new IllegalArgumentException("Numéro do partido inválido");
		}
		this.numero = numero;
	}
	
	public void addVereador(Vereador v) {
		if (v == null) {
			throw new IllegalArgumentException("Vereador não pode ser nulo");
		}
		this.vereadores.add(v);
		v.setPartido(this);
	}
	
	public int getQtdProjAprov() {
		int total = 0;
		for (Vereador ver: this.vereadores) {
			total += ver.getQtdProjAprov();
		}
		return total;
	}
	
	public int getQtdProjApres() {
		int total = 0;
		for (Vereador ver: this.vereadores) {
			total += ver.getQtdProjApres();
		}
		return total;
	}
	
	public double getMediaDesempenho() {
		if (this.vereadores.isEmpty()) {
			return 0;
		}
		double total = 0;
		for (Vereador ver: this.vereadores) {
			total += ver.getDesempenho();
		}
		return total/this.vereadores.size();
	}	
	
	public Vereador getVereadorMenorDesempenho() {
		if (this.vereadores.isEmpty()) {
			return null;
		}
		Vereador pior = this.vereadores.get(0);
		for (Vereador ver: this.vereadores) {
			if (ver.getDesempenho() < pior.getDesempenho()) {
				pior = ver;
			}
		}
		return pior;
	}
	
	public ArrayList<Vereador> getVereadores(){
		return this.vereadores;
	}
	
	public int getQtdVereadores() {
		return this.vereadores.size();
	}
 }
