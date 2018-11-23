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

    private final static LocalDate TIMESTAMP = LocalDate.now();

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, TIMESTAMP);
	});
    }

    @SuppressWarnings("null")
    @Test
    void shouldNotConstructNullAmountTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer((Double) null, TIMESTAMP);
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
	Transfer transfer = new Transfer(250.00, TIMESTAMP);
	double expected = transfer.getAmount();
	assertEquals(250, expected);
    }

    @Test
    void shouldTimestampBeEquals() {
	Transfer transfer = new Transfer(250.00, TIMESTAMP);
	LocalDate expected = transfer.getTimestamp();
	assertEquals(TIMESTAMP, expected);
    }
}
