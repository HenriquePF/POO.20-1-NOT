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
        String str= "Nome do usuário: "+this.getNomeUsuario()
                +"\nNumero do telefone: "+this.getNumeroTelefone()
                +"\nEndereco: "+this.getEnderecoInstalacao()
                +"\nData de instalação:"+this.getDataInstalacao()
                +"\nConexão com internet:";
        if (this.isConexaoInternet()) {
        	str += "Sim";
        }
        else {
        	str += "Não";
        }
        return str;
                //+(this.isConexaoInternet()?"Sim":"Nao");
    }
}
