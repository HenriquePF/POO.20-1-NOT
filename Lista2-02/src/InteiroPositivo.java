
public class InteiroPositivo {
	private int x;

	// item a
	public void setValor(int valor) {
		if (valor >= 0) {
			this.x = valor;
		}
	}

	// item b
	public int multiplica(InteiroPositivo outro) {
		return this.x * outro.getValor();
	}

	public int getValor() {
		return this.x;
	}

	// item c
	public long fatorial() {
		// calcular o fatorial do this.x
		return fatorial(this.x);
	}
	
	private long fatorial(int valor) {
		// calcular o fatorial do parâmetro
		long fatorial = 1;
		for (int i = valor; i > 0; i--) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	// item d
	public String divisoresInteiros() {
		String retorno = "Os divisores são ";
		int contador=0;
		for (int num = 1; num <= this.x; num++) {
			if (this.x % num == 0) { // num é um divisor inteiro
				retorno += num+", ";
				contador++;
			}
		}
		int pos = retorno.lastIndexOf(", ");
		if (pos != -1) {
			retorno = retorno.substring(0, pos);
		}
		return retorno+" e a quantidade de divisores é "+contador;
	}
	
	public int[] fibonacci() {
		int[] retorno = new int[this.x];
		if (this.x > 0) {
            retorno[0]= 1;
            if (this.x > 1) {
                retorno[1]= 1;
            }
        }
        for (int i = 2; i < this.x ; i++) {
            retorno[i] = retorno[i-2]+retorno[i-1];
        }
		return retorno;
	}
	
	//item g
	public double getValorI() {
		double i = 0;
		double den =0;
		for (int num = 1; num <= this.x; num++) {
			den = this.x - (num-1);
			i += num / den;
		}
		return i;
	}
	
	// item i
	public double getValorP() {
		double p = 0;
		double den = 0;
		boolean soma = true;
		for (int num = 1; num <= this.x; num++) {
			den = this.fatorial(num*2); 
			if (soma) {	// soma == true	
				p += num / den;
			}
			else {
				p -= num / den;
			}
			soma = !soma;
		}
		
		return p;
	}
}
