
public class TelefoneEspecializado extends Telefone{
	private int qtdOcorrencias;
	
	
	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}

	public void setQtdOcorrencias(int qtdOcorrencias) {
		if (qtdOcorrencias <= 0) {
			throw new IllegalArgumentException("Quantidade de ocorrências deve ser maior que zero.");
		}
		this.qtdOcorrencias = qtdOcorrencias;
	}

	@Override
	public double getValorBasico() {
		if (this.qtdOcorrencias < 1001) {
			return 50.00;
		}
		if (this.qtdOcorrencias < 5001) {
			return 67.80;
		}
		if (this.qtdOcorrencias < 10001) {
			return 98.50;
		}
		if (this.qtdOcorrencias < 50001) {
			return 123.90;
		}
		return 187.82;
	}

	public String exibir() {  // Giancarlo
        String msg = "";
        msg="Nome: "+ this.getNomeUsuario();
        msg+="\nEndereço: " + this.getEnderecoInstalacao();
        msg+="\nTelefone: " + this.getNumeroTelefone();
        msg+="\nData de Instalação: " + this.getDataInstalacao();
        msg+="\nQtde Ocorrências: " + this.getQtdOcorrencias();
        return msg;
    }	
}
