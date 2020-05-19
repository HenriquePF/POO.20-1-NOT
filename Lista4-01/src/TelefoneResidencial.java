import java.time.LocalDate;

public class TelefoneResidencial extends Telefone{
	private boolean conexaoInternet;

	public TelefoneResidencial() {
		
	}
	
	public TelefoneResidencial(String numero, String nomeUsuario, LocalDate data, 
								String endereco, boolean internet) {
		super(numero, nomeUsuario, data, endereco);
		this.setConexaoInternet(internet);
	}



	public boolean isConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}
	
	public double getValorBasico() {
		return 15;
	}
	
	public String exibir(){  // Vitor
        String str= "Nome do usu�rio: "+this.getNomeUsuario()
                +"\nNumero do telefone: "+this.getNumeroTelefone()
                +"\nEndereco: "+this.getEnderecoInstalacao()
                +"\nData de instala��o:"+this.getDataInstalacao()
                +"\nConex�o com internet:";
        if (this.isConexaoInternet()) {
        	str += "Sim";
        }
        else {
        	str += "N�o";
        }
        return str;
                //+(this.isConexaoInternet()?"Sim":"Nao");
    }
}
