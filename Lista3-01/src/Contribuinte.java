
public class Contribuinte {
	private String nome;
	private String uf;
	private String cpf;
	private float rendaAnual;
	
	
	public Contribuinte(String nome, String uf, String cpf, float rendaAnual) {
		this.setNome(nome);
		this.setUf(uf);
		this.setCpf(cpf);
		this.setRendaAnual(rendaAnual);
	}
	
	public Contribuinte() {
		
	}
	
	public float getImpostoAPagar() {
		return this.rendaAnual * this.getAliquota();
	}

	public float getAliquota() {
		if (this.rendaAnual < 4001) {
			return 0;
		}
		if (this.rendaAnual < 9001) {
			return 0.058f; // 5,8%
		}
		if (this.rendaAnual < 25001) {
			return 0.15F; // 15%
		}
		if (this.rendaAnual < 35001) {
			return 0.275f; // 27,5%
		}
		return 0.3F; // 30%
	}
	
	public void setNome(String dado) {
		this.nome = dado;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		if (uf.equals("RS")
				|| uf.equals("SC")
				|| uf.equals("PR")) {
			this.uf = uf;
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(float rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
	}
	
	
}
