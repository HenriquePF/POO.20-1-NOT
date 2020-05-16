
public class MainTelefone {
	public static void main(String[] args) {
		TelefoneResidencial t;
		t = new TelefoneResidencial();
		t.setNomeUsuario("Joao");
		t.setNumeroTelefone("1234567890");
		t.setConexaoInternet(true);
		System.out.println("Telefone"+t.getNumeroTelefone()
						+" "+t.getNomeUsuario()
						+" "+t.getValorBasico());
		
		TelefoneComercial tc;
		tc = new TelefoneComercial();
		tc.setNomeUsuario("XPTO");
		tc.setNumeroTelefone("0987654321");
		tc.setRamoAtividade("Vendas");
		System.out.println("Telefone"+tc.getNumeroTelefone()
		+" "+tc.getNomeUsuario()
		+" "+tc.getValorBasico());
		
		Telefone tel;
		tel = new TelefoneComercial();
		tel.setRamoAtividade("Indústria");
	}

}
