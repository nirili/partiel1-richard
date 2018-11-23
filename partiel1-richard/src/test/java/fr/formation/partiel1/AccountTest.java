package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

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
}
