
public class Obra {
	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private int indice = 0;

	public void addParecer(Parecer p) {
		if (this.indice < this.pareceres.length) { // ainda há espaço?
			this.pareceres[this.indice] = p;
			this.indice++;
		}
		else {
			IllegalArgumentException exc = new IllegalArgumentException("Não há mais espaço para pareceres.");
			throw exc;
		}
	}
	
	public int getQtdePareceres() {
		return this.indice;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		else {
			throw new IllegalArgumentException("Título da obra inválido");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.isEmpty()) {
			throw new IllegalArgumentException("Nome do autor inválido");
		}
		this.autor = autor;
	}

	public String mostra() {
		String resultado = "Obra: "+this.titulo
							+"\nAutor: "+this.autor
							+"\nPareceres:"+this.indice;
		for (int i=0; i < this.indice; i++) {
			resultado += "\n"+(i+1)+": Parecerista:"+this.pareceres[i].getNomeParecerista()
							+"\n\tData:"+this.pareceres[i].getData()
							+"\n\tConteúdo:"+this.pareceres[i].getConteudo();
		}
		return resultado;
	}

}
