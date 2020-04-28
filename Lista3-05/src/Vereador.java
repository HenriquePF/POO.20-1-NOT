
public class Vereador {
	private String nome;
	private Partido partido;
	private int qtdProjApres, qtdProjAprov;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do vereador inválido");
		}
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getQtdProjApres() {
		return qtdProjApres;
	}

	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres < 0) {
			throw new IllegalArgumentException("Quantidade de projetos apresentados não pode ser menor que zero");
		}
		this.qtdProjApres = qtdProjApres;
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}

	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov < 0) {
			throw new IllegalArgumentException("Quantidade de projetos aprovados não pode ser menor que zero");
		}
		this.qtdProjAprov = qtdProjAprov;
	}

	public double getIndiceTrabalho() {
		if (this.qtdProjApres == 0) {
			return 0;
		}
		if (this.qtdProjApres < 6) {
			return 0.8;
		}
		if (this.qtdProjApres < 11) {
			return 1.0;
		}
		if (this.qtdProjApres < 18) {
			return 1.08;
		}
		return 1.22;
	}

	public double getIndiceTrabalho1() {
		double indice = 0;
		if (this.qtdProjApres == 0) {
			indice = 0;
		} else if (this.qtdProjApres < 6) {
			indice = 0.8;
		} else if (this.qtdProjApres < 11) {
			indice = 1.0;
		} else if (this.qtdProjApres < 18) {
			indice = 1.08;
		} else {
			indice = 1.22;
		}
		return indice;
	}

	public double getDesempenho() {
		return (this.qtdProjAprov / (double)this.qtdProjApres) * this.getIndiceTrabalho();
	}				// int / double --> double
}
