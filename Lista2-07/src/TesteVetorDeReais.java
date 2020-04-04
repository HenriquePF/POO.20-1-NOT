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
	
	
	// Solução do exercício 12 - Lista 2
	@Test
    void testCaso1()  {
        VetorDeReais obj1 = new VetorDeReais(3);
        obj1.setValor(2, 0);
        obj1.setValor(-1, 1);
        obj1.setValor(3.5, 2);
        VetorDeReais obj2 = new VetorDeReais(1);
        obj2.setValor(3, 0);
        assertNull(obj1.divide(obj2));
    }

	@Test
    void testCaso2()  {
        VetorDeReais obj1 = new VetorDeReais(3);
        obj1.setValor(2, 0);
        obj1.setValor(-1, 1);
        obj1.setValor(3.5, 2);
        VetorDeReais obj2 = new VetorDeReais(3);
        obj2.setValor(3, 0);
        obj2.setValor(2, 1);
        obj2.setValor(1, 2);
        VetorDeReais objRes = obj1.divide(obj2);
        assertEquals(3.5, objRes.getValor(2));
        assertEquals(-0.5, objRes.getValor(1));
        assertEquals(0.6666666, objRes.getValor(0), 0.000001);
    }
	
	@Test
    void testCaso2A()  {
        VetorDeReais obj1 = new VetorDeReais(3);
        obj1.setValor(2, 0);
        obj1.setValor(-1, 1);
        obj1.setValor(3.5, 2);
        VetorDeReais obj2 = new VetorDeReais(3);
        obj2.setValor(3, 0);
        obj2.setValor(2, 1);
        obj2.setValor(1, 2);
        VetorDeReais objRes = obj1.divide(obj2);
        assertEquals("[0.6666666666666666, -0.5, 3.5]", objRes.exibe());
    }
	
	@Test
    void testCaso2B()  {
        VetorDeReais obj1 = new VetorDeReais(3);
        obj1.setValor(2, 0);
        obj1.setValor(-1, 1);
        obj1.setValor(3.5, 2);
        VetorDeReais obj2 = new VetorDeReais(3);
        obj2.setValor(3, 0);
        obj2.setValor(2, 1);
        obj2.setValor(1, 2);
        VetorDeReais objRes = obj1.divide(obj2);
        double[] vetor = {0.666666 , -0.5 , 3.5};
        for (int i=0; i < vetor.length; i++) {
        	assertEquals(vetor[i], objRes.getValor(i),0.00001);	
        }
    }	
}
