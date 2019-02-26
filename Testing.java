import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testing {

	String tel1, tel2;
	@BeforeEach
	void setup() {
		tel1 = "5555555555";
		tel2 = "(123)456-7890";
	}
	
	@Test
	void test1() {
		assertFalse(Telephone.isFormatted(tel1));
		assertTrue(Telephone.isFormatted(tel2));
	}
	
	@Test
	void test2() {
		assertEquals(Telephone.format(tel1), "(555)555-5555");
	}
	
	@Test
	void test3() {
		assertEquals(Telephone.unformat(tel2), "1234567890");
	}

}
