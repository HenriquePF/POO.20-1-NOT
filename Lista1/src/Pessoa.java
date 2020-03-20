import java.time.LocalDate;

class Pessoa{
	private String nome;
	private char sexo;
	private LocalDate dataNascimento;
	private String estadoCivil = "Solteiro"; // 1a forma de fazer a inicializa��o

	public Pessoa(String nome, char sexo, LocalDate data){
		this.nome = nome;
		this.setSexo(sexo);
		this.dataNascimento = data;
		this.estadoCivil = "Solteiro";  // 2a forma de fazer a inicializa��o
	}
	
	public void setSexo(char valor){
		if (valor == 'F' || valor == 'M'
			|| valor == 'X'){
			this.sexo = valor;
		}
	}

	public char getSexo(){
		return this.sexo;
	}	
}