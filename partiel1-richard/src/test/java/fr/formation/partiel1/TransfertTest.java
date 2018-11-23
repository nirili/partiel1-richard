package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

@SuppressWarnings("javadoc")
public class TransfertTest {

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, LocalDate.now());
	});
    }

    @SuppressWarnings("null")
    @Test
    void shouldNotConstructTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer((Double) null, LocalDate.now());
	});
    }

    @Test
    void shouldAmountBeEquals() {
	Transfer transfer = new Transfer(250.00, LocalDate.now());
	double expected = transfer.getAmount();
	assertEquals(250, expected);
    }
}
