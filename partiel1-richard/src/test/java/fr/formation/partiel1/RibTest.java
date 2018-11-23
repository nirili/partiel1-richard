package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class RibTest {

    @Test
    void shouldConstructRib() {
	assertDoesNotThrow(() -> {
	    new Rib(30042, 00550, "0000246810R", 75);
	});
    }
}
