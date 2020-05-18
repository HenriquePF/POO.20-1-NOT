import java.time.LocalDate;

public class MainTelefone {
	public static void main(String[] args) {
		TelefoneResidencial t;
		t = new TelefoneResidencial("1234567890", "Joao", null, "Rua 7,1500", true);

		System.out.println("Telefone "+t.getNumeroTelefone()
						+" "+t.getNomeUsuario()
						+" "+t.getValorBasico());
		
		TelefoneComercial tc;
		tc = new TelefoneComercial("XPTO","Vendas","0987654321", "Rua XV,100",LocalDate.now());
		System.out.println("Telefone "+tc.getNumeroTelefone()
		+" "+tc.getNomeUsuario()
		+" "+tc.getValorBasico());
		
		
		TelefoneEspecializado te;
		te = new TelefoneEspecializado();
		te.setNomeUsuario("XPTO");
		te.setNumeroTelefone("0987654320");
		te.setQtdOcorrencias(12000);
		System.out.println("Telefone "+te.getNumeroTelefone()
		+" "+te.getNomeUsuario()
		+" "+te.getValorBasico());
		
		Telefone tel;
		tel = new TelefoneComercial();
		((TelefoneComercial)tel).setRamoAtividade("Indústria");
	}

}
