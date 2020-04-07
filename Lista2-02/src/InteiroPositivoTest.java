import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	final void testCasoTeste01() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(10);
		long result = 3628800;
		assertEquals(result,ip.fatorial());
	}

	@Test
	final void testCasoTeste02() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(20);
		long result = 2_432_902_008_176_640_000L;
		assertEquals(result,ip.fatorial());
	}
	
	@Test
	final void testCasoTeste03() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(14);
		String result = "Os divisores são 1, 2, 7, 14 e a quantidade de divisores é 4";
		assertEquals(result, ip.divisoresInteiros());
	}
	
	@Test
	final void testCasoTeste04() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(18);
		String result = "Os divisores são 1, 2, 3, 6, 9, 18 e a quantidade de divisores é 6";
		assertEquals(result, ip.divisoresInteiros());
	}
	
	@Test
	final void testCasoTeste05() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(9);
		int[] result = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		assertArrayEquals(result, ip.fibonacci());
	}

	@Test
	final void testCasoTeste06() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(15);
		int[] result = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		assertArrayEquals(result, ip.fibonacci());
	}
}
