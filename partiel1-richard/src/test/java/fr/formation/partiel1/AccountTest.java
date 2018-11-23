package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AccountTest {

    private final static String COUNTRYCODE = "fr";

    private final static String CONTROLKEY = "33";

    private final static Rib RIB = new Rib("00000", "11111", "0000135790Y",
	    "55");

    @Test
    void shouldConstructAccount() {
	assertDoesNotThrow(() -> {
	    new Account(COUNTRYCODE, CONTROLKEY, RIB);
	});
    }

    @Test
    void shouldNotConstructWithNullValues() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(null, null, null);
	});
    }

    @Test
    void shouldNotConstructWithNullCountryCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(null, CONTROLKEY, RIB);
	});
    }

    @Test
    void shouldNotConstructWithNullControlKey() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(COUNTRYCODE, null, RIB);
	});
    }

    @Test
    void shouldNotConstructWithNullRib() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(COUNTRYCODE, CONTROLKEY, null);
	});
    }

    // Account Class methods Tests
    @Test
    void shouldNotFailMethodGetCountryCode() {
	Account account = new Account(COUNTRYCODE, CONTROLKEY, RIB);
	assertEquals("fr", account.getCountryCode());
    }

    @Test
    void shouldNotFailMethodGetControlKey() {
	Account account = new Account(COUNTRYCODE, CONTROLKEY, RIB);
	assertEquals("33", account.getControlKey());
    }

    @Test
    void shouldNotFailMethodGetRib() {
	Account account = new Account(COUNTRYCODE, CONTROLKEY, RIB);
	assertEquals(RIB, account.getRib());
    }
}
