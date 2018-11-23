package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author Richard Phonthibsvads
 */
class RibTest {

    private final static String BANKCODE = "30050";

    private final static String COUNTERCODE = "00550";

    private final static String ACCOUNTNUM = "0000222222X";

    private final static String RIBKEY = "93";

    @Test
    void shouldConstructRib() {
	assertDoesNotThrow(() -> {
	    new Rib("30042", "00550", "0000246810R", "75");
	});
    }

    @Test
    void shouldNotConstructRib() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, null, null, null);
	});
    }

    // Rib Class methods tests
    @Test
    void shouldNotFailMethodGetBankCode() {
	Rib rib = new Rib(BANKCODE, COUNTERCODE, ACCOUNTNUM, RIBKEY);
	assertEquals(BANKCODE, rib.getBankCode());
    }

    @Test
    void shouldNotFailMethodGetCounterCode() {
	Rib rib = new Rib(BANKCODE, COUNTERCODE, ACCOUNTNUM, RIBKEY);
	assertEquals(COUNTERCODE, rib.getCounterCode());
    }

    @Test
    void shouldNotFailMethodGetAccountNum() {
	Rib rib = new Rib(BANKCODE, COUNTERCODE, ACCOUNTNUM, RIBKEY);
	assertEquals(ACCOUNTNUM, rib.getAccountNum());
    }

    @Test
    void shouldNotFailMethodGetRibKey() {
	Rib rib = new Rib(BANKCODE, COUNTERCODE, ACCOUNTNUM, RIBKEY);
	assertEquals(RIBKEY, rib.getRibKey());
    }
}
