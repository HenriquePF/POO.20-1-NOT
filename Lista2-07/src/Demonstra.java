
public class Demonstra {
	public static void main(String[] args) {
		VetorDeReais objV1;
		VetorDeReais objV2, objV3;
		objV1 = new VetorDeReais(3);
		objV1.setValor(3.1415192,0);
		objV1.setValor(-234.567, 1);
		objV1.setValor(90.5, 2);
		System.out.println("Qt pares = "+objV1.getQtdePares());
		
		objV2 = new VetorDeReais(3);
		objV2.setValor(3.1415192,0);
		objV2.setValor(-234.567, 1);
		objV2.setValor(90.5, 2);
		
		objV3 = objV1.divide(objV2);
		System.out.println(objV3.exibe());
		
		double resultado = objV2.multiplica(objV3);
		System.out.println(resultado);
		
		System.out.println("Antes = "+objV1.exibe());
		objV1.inverte();
		System.out.println("Depois = "+objV1.exibe());
	}
}
