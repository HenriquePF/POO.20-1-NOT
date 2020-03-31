import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteVetorDeReais {

	@Test
	final void test1() {
		VetorDeReais objV1;
		objV1 = new VetorDeReais(3);
		objV1.setValor(3.1415192, 0);
		objV1.setValor(-234.567, 1);
		objV1.setValor(90.5, 2);
		assertEquals(2, objV1.getQtdePares());
	}

	@Test
	final void test2() {
		VetorDeReais objV1;
		VetorDeReais objV2;
		objV1 = new VetorDeReais(3);
		objV1.setValor(1.0, 0);
		objV1.setValor(1.0, 1);
		objV1.setValor(1.0, 2);

		objV2 = new VetorDeReais(3);
		objV2.setValor(3.1415192, 0);
		objV2.setValor(-234.567, 1);
		objV2.setValor(90.5, 2);

		assertEquals(-140.9254, objV2.multiplica(objV1), 0.0001);
	}

	@Test
	final void test3() {
		VetorDeReais objV1;
		VetorDeReais objV2;

		objV1 = new VetorDeReais(3);
		objV1.setValor(3.1415192, 0);
		objV1.setValor(-234.567, 1);
		objV1.setValor(90.5, 2);

		objV2 = new VetorDeReais(3);
		objV2.setValor(3.1415192, 0);
		objV2.setValor(-234.567, 1);
		objV2.setValor(90.5, 2);

		assertEquals("[1.0, 1.0, 1.0]", objV1.divide(objV2).exibe());
	}

	@Test
	final void test4() {
		VetorDeReais objV1;

		objV1 = new VetorDeReais(3);
		objV1.setValor(70.0, 0);
		objV1.setValor(80.0, 1);
		objV1.setValor(90.0, 2);

		assertEquals(10.0, objV1.getMaiorDiferenca());
	}
}
