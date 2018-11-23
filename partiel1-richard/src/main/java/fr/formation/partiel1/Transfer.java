package fr.formation.partiel1;

import java.time.LocalDate;

public class Transfer {

    private double amount;

    LocalDate timestamp;

    public Transfer(double amount, LocalDate timestamp) {
	setAmount(amount);
	setTimestamp(timestamp);
    }

    public double getAmount() {
	return amount;
    }

    public LocalDate getTimestamp() {
	return timestamp;
    }

    private void setAmount(double amount) {
	this.amount = amount;
    }

    private void setTimestamp(LocalDate timestamp) {
	this.timestamp = timestamp;
    }
}
