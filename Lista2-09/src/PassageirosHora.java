
public class PassageirosHora {
	private int[][][] matriz;
	
	public PassageirosHora() {
		this.matriz = new int[12][30][24]; // 12 meses, 30 dias em cada mês, 24 horas em cada dia
	}
	
	public void adiciona(int dia, int mes, int hora) {
		this.matriz[mes-1][dia-1][hora]++;
		//this.matriz[mes-1][dia-1][hora]  = this.matriz[mes-1][dia-1][hora] + 1;
	}
	
	public int quantosPassageiros(int dia, int mes) {
		int total=0;
		dia--; // para adaptar do valor natural para o índice na matriz
		mes--;
		
		for (int h=0; h < this.matriz[mes][dia].length; h++) {
			total = total + this.matriz[mes][dia][h];
		}
		return total;
	}
	
	public int mesMenorFluxo() {
		int mesMenor=1;  // assumindo que o mês menor é Janeiro
		int qtdMenor = this.quantosPassageiros(1);  // calculando Janeiro
		int qtde;
		for (int mes=2; mes <= 12; mes++) {
			qtde = this.quantosPassageiros(mes);
			if (qtde < qtdMenor) {
				mesMenor = mes;
				qtdMenor = qtde;
			}
		}
		return mesMenor;
	}
	
	public int quantosPassageiros(int mes) {
		int total=0;
		for (int dia=1; dia <=30 ; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}
		return total;
	}
	
	public int[] picoTransporte() {
		int diaMaior, mesMaior, horaMaior, qtdMaior;
		qtdMaior = Integer.MIN_VALUE;
		diaMaior = mesMaior = horaMaior = 0;
		for (int m=0; m < this.matriz.length; m++) {
			for (int d=0; d < this.matriz[m].length; d++) {
				for (int h=0; h < this.matriz[m][d].length; h++) {
					if (this.matriz[m][d][h] > qtdMaior) {
						qtdMaior = this.matriz[m][d][h];
						mesMaior = m;
						diaMaior = d;
						horaMaior= h;
					}
				}
			}
		}
		
		int[] retorno = {diaMaior+1, mesMaior+1, horaMaior, qtdMaior};
		return retorno;
	}
	
}
