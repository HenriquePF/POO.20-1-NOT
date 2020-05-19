import java.time.LocalDate;

public class TelefoneComercial extends Telefone {
	private String ramoAtividade;
	private static LocalDate dataBase = LocalDate.of(2017, 01, 01);

	public TelefoneComercial(){
		
	}
	
	public TelefoneComercial(String nomeUsuario, String ramo, String numero, String endereco, LocalDate data) {
		super(numero, nomeUsuario, data, endereco);
		this.setRamoAtividade(ramo);
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	@Override
	public double getValorBasico() {
		if (this.dataInstalacao.isBefore(dataBase)) {
			return 25;
		} else {
			return 37.50;
		}
	}
	
	public String exibir() { // Gustavo
        return "Informações do Telefone = " + "\nEndereço - " + this.getEnderecoInstalacao() + "\nData instalação - "
                + this.getDataInstalacao() + "\nNome do cliente - " + this.getNomeUsuario() 
                + "\nTelefone - " + this.getNumeroTelefone()
                + "\nRamo de Atividade - " + this.getRamoAtividade();
    }

}
