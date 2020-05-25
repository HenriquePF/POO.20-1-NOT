
public enum FormaDeIngresso {
	VESTIBULAR("Vestibular"), 
	ENEM("ENEM"), 
	SELETIVO("Seletivo especial"), 
	EXTERNA("Transferência externa"),
	INTERNA("Transferência interna"),
	INDICACAO("Indicação da Vó");

	private String descricao;

	FormaDeIngresso(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
