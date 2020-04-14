import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	// IMPOSTO
	@Test
	final void testI1() {
		Contribuinte c1 = new Contribuinte();
		c1.setRendaAnual(3000);
		assertEquals(0, c1.getImpostoAPagar());
	}

	@Test
	final void testI2() {
		Contribuinte c1 = new Contribuinte();
		c1.setRendaAnual(9000);
		assertEquals(522, c1.getImpostoAPagar());
	}

	@Test
	final void testI3() {
		Contribuinte c1 = new Contribuinte();
		c1.setRendaAnual(10000);
		assertEquals(1500, c1.getImpostoAPagar());
	}

	@Test
	final void testI4() {
		Contribuinte c1 = new Contribuinte();
		c1.setRendaAnual(34911.73F);
		assertEquals(9600.72, c1.getImpostoAPagar(), 0.009);
	}

	   //UF
	   
    @Test
    final void testUF1() {
        Contribuinte c1 = new Contribuinte();
        c1.setUf("SC");
        assertEquals("SC", c1.getUf());
    }
   
    @Test
    final void testUF2() {
        Contribuinte c1 = new Contribuinte();
        c1.setUf("PR");
        assertEquals("PR", c1.getUf());
    }
   
    @Test
    final void testUF3() {
        Contribuinte c1 = new Contribuinte();
        c1.setUf("RS");
        assertEquals("RS", c1.getUf());
    }
    @Test
    final void testUF4() {
        Contribuinte c1 = new Contribuinte();
        c1.setUf("SC");
        c1.setUf("SP");
        assertEquals("SC", c1.getUf());
    }
    @Test
    final void testUF5() {
        Contribuinte c1 = new Contribuinte();
        c1.setUf("SC");
        c1.setUf("RJ");
        assertEquals("SC", c1.getUf());
    }

	// RENDA NEGATIVA

	@Test
	final void testRN() {
		Contribuinte c1 = new Contribuinte();
		c1.setRendaAnual(3000);
		c1.setRendaAnual(-818.50F);
		assertEquals(3000, c1.getRendaAnual());
	}
}
