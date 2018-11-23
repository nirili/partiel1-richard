package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TransferTest {

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, LocalDate.now()));
	});
    }
}
