public class PrincipalQ2 {
	public static void main(String[] args){
		Produto produto1;
		produto1 = new Produto("caderno",
				"Caderno em espiral tamanho m�dio",
				4.5f,
				15);

		Produto produto2;
		produto2 = new Produto();
		produto2.setNome("Caneta ESF");
		produto2.setDescricao("Caneta esferogr�fica 5mm");
		produto2.setPrecoUnitario(1.2f);
		produto2.setDesconto(2);

		Produto produto3 = new Produto("Esquadro",
					"Esquadro de acr�lico 20 cm",
					2.35f, 10);

	}
}
