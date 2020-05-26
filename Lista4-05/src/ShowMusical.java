import java.time.LocalDate;

public class ShowMusical extends Evento{
	private String nomeBanda;
	private String estiloMusical;
	
	public ShowMusical(String titulo, float valor, LocalDate data, String banda, String estilo) {
		super(titulo, valor, data);
		this.setNomeBanda(banda);
		this.setEstiloMusical(estilo);
	}
	
	@Override
	public String exibir() {
		// Show Musical Tempo passado de rock progressivo de Grupo GFD com ingressos a R$ 15,00, contou com 265 pagantes no dia 15/09/2019. Opinião: Muuuito louco...
		String str = "Show Musical "+this.getTitulo()+ " de "+this.getEstiloMusical()
					+ " de "+this.getNomeBanda()+" com ingressos a R$"+this.getValor();
		if (this.isAvaliado()) {
			str += "contou com "+this.getAvaliacaoRealizada().getQtdPagantes()
					+" pagantes no dia "+this.getData()
					+". Opinião: "+this.getAvaliacaoRealizada().getOpiniaoGeral();
		}
		else {
			str += ", dia "+this.getData()+". Ainda não realizado.";
		}
		return str;
	}



	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	
	

}
