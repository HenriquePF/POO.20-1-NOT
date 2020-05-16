
public class TelefoneComercial extends Telefone {
	private String ramoAtividade;
	
	
	
	public String getRamoAtividade() {
		return ramoAtividade;
	}



	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}



	@Override
	public double getValorBasico() {
		return 27.50;
	}

}
