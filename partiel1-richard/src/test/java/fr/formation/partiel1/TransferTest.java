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

    private final static Account EMITTER = new Account("fr", "75", RIB);

    private final static Account BENEFICIARY = new Account("fr", "33", RIB2);

    @Test
    void shouldConstructTransfer() {
	assertDoesNotThrow(() -> {
	    new Transfer(1000.00, EMITTER, BENEFICIARY, EXECUTIONDATE);
	});
    }

    @SuppressWarnings("null")
    @Test
    void shouldNotConstructNullAmountTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer((Double) null, EMITTER, BENEFICIARY, EXECUTIONDATE);
	});
    }

    @Test
    void shouldNotConstructNullEmitterTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(1500.00, null, BENEFICIARY, EXECUTIONDATE);
	});
    }

    @Test
    void shouldNotConstructNullBeneficiaryTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(1500.00, EMITTER, BENEFICIARY, null);
	});
    }

    @Test
    void shouldNotConstructNullExecutionDateTransfer() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(250.00, EMITTER, BENEFICIARY, null);
	});
    }

    // Transfer Class methods tests
    @Test
    void shouldAmountBeEquals() {
	Transfer transfer = new Transfer(250.00, EMITTER, BENEFICIARY,
		EXECUTIONDATE);
	double expected = transfer.getAmount();
	assertEquals(250, expected);
    }

    @Test
    void shouldEmitterBeEquals() {
	Transfer transfer = new Transfer(250.00, EMITTER, BENEFICIARY,
		EXECUTIONDATE);
	Account expected = transfer.getEmitter();
	assertEquals(EMITTER, expected);
    }

    @Test
    void shouldBeneficiaryBeEquals() {
	Transfer transfer = new Transfer(250.00, EMITTER, BENEFICIARY,
		EXECUTIONDATE);
	Account expected = transfer.getBeneficiary();
	assertEquals(BENEFICIARY, expected);
    }

    @Test
    void shouldTimestampBeEquals() {
	Transfer transfer = new Transfer(250.00, EMITTER, BENEFICIARY,
		EXECUTIONDATE);
	LocalDate expected = transfer.getExecutionDate();
	assertEquals(EXECUTIONDATE, expected);
    }
}
