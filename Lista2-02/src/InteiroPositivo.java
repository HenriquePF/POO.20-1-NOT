
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
		long fatorial = 1;
        for(int i = this.x; i > 0; i --) {
            fatorial = fatorial * i;
        }
        return fatorial;
	}
}
