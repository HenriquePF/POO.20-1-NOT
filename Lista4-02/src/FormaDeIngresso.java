
public enum FormaDeIngresso {
	VESTIBULAR("Vestibular"), 
	ENEM("ENEM"), 
	SELETIVO("Seletivo especial"), 
	EXTERNA("Transfer�ncia externa"),
	INTERNA("Transfer�ncia interna"),
	INDICACAO("Indica��o da V�");

	private String descricao;

	FormaDeIngresso(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
