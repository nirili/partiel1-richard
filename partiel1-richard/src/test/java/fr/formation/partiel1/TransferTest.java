package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * @author Richard Phonthibsvads
 */
public class TransferTest {

    private final static LocalDate EXECUTIONDATE = LocalDate.now();

    private final static LocalDate REQUESTDATE = LocalDate.now();

    private final static Rib RIB = new Rib("30042", "00550", "0000246810R",
	    "75");

    private final static Rib RIB2 = new Rib("30000", "00770", "0000112288K",
	    "57");

    private final static Account ACCOUNTEMITTER = new Account("fr", "75", RIB);

    private final static Account ACCOUNTBENEFICIARY = new Account("fr", "33",
	    RIB2);

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, EXECUTIONDATE);
	});
    }

    @SuppressWarnings("null")
    @Test
    void shouldNotConstructNullAmountTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer((Double) null, EXECUTIONDATE);
	});
    }

    @Test
    void shouldNotConstructNullTimestampTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(250.00, null);
	});
    }

    // Transfer Class methods tests
    @Test
    void shouldAmountBeEquals() {
	Transfer transfer = new Transfer(250.00, EXECUTIONDATE);
	double expected = transfer.getAmount();
	assertEquals(250, expected);
    }

    @Test
    void shouldTimestampBeEquals() {
	Transfer transfer = new Transfer(250.00, EXECUTIONDATE);
	LocalDate expected = transfer.getTimestamp();
	assertEquals(EXECUTIONDATE, expected);
    }
}
