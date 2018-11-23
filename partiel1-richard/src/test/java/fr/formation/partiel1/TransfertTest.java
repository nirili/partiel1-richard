package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

@SuppressWarnings("javadoc")
public class TransfertTest {

    private final static LocalDate TIMESTAMP = LocalDate.now();

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, TIMESTAMP);
	});
    }

    @SuppressWarnings("null")
    @Test
    void shouldNotConstructTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer((Double) null, TIMESTAMP);
	});
    }

    @Test
    void shouldAmountBeEquals() {
	Transfer transfer = new Transfer(250.00, TIMESTAMP);
	double expected = transfer.getAmount();
	assertEquals(250, expected);
    }
}
