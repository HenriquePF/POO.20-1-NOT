import java.util.Arrays;

public class VetorDeReais {
	private double[] vetor;

	public VetorDeReais(int tamanho) {
		vetor = new double[tamanho];
	}

	// item a
	public void setValor(double valor, int posicao) {
		this.vetor[posicao] = valor;
	}

	// item b
	public int getQtdePares() {
		int contador = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if ((int) this.vetor[i] % 2 == 0) { // a parte inteira é par?
				contador++;
			}
		}
		return contador;
	}

	// item c
	public VetorDeReais divide(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) { // se forem de tamanhos diferentes
			return null;
		}
		VetorDeReais novo = new VetorDeReais(this.vetor.length);
		double valor;
		for (int i = 0; i < this.vetor.length; i++) {
			valor = this.getValor(i) / outro.getValor(i);
			novo.setValor(valor, i);
		}
		return novo;
	}

	public String exibe() {
		return Arrays.toString(this.vetor);
	}

	public int getTamanho() {
		return this.vetor.length;
	}

	public double getValor(int posicao) {
		return this.vetor[posicao];
	}

	// item d
	public double multiplica(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.MIN_VALUE; // Double.MAX_VALUE;
		}
		double m = 0;
		for (int i = 0, j = this.getTamanho() - 1; i < this.vetor.length; i++, j--) {
			m += this.vetor[i] * outro.getValor(j);
		}

		return m;
	}

	// item e
	public void inverte() {
		double temp;
		int meio = this.getTamanho() / 2;
		for (int i = 0, j = this.getTamanho() - 1; i < meio; i++, j--) {
			temp = this.vetor[i];
			this.vetor[i] = this.vetor[j];
			this.vetor[j] = temp;
		}
	}

	// item f
	public double getMaiorDiferenca() {
		double dif = Double.MIN_VALUE;
		double temp;
		for (int i = 0; i < vetor.length - 1; i++) {
			temp = Math.abs(this.vetor[i] - this.vetor[i + 1]);
			if (temp > dif) {
				dif = temp;
			}
		}
		return dif;
	}

}
