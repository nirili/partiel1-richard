package fr.formation.partiel1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Richard Phonthibsvads
 */
public class Transfer {

    private double amount;

    LocalDate timestamp = LocalDate.now();

    private List<Account> accounts = new ArrayList<>();

    /**
     * @param amount
     *                  type double
     * @param timestamp
     *                  type LocalDate
     */
    public Transfer(double amount, LocalDate timestamp) {
	setAmount(amount);
	setTimestamp(timestamp);
    }

    /**
     * Method getAmount() returns double amount
     *
     * @return amount
     */
    public double getAmount() {
	return amount;
    }

    /**
     * Method getTimestamp() returns LocalDate timestamp
     *
     * @return timestamp
     */
    public LocalDate getTimestamp() {
	return timestamp;
    }

    /**
     * Method getAccounts() returns a list of Account accounts
     *
     * @return accounts
     */
    public List<Account> getAccounts() {
	// Defensive copy
	return Collections.unmodifiableList(accounts);
    }

    public boolean addAccount(Account account) {
	Objects.requireNonNull(account, "Currency is required");
	return accounts.add(account);
    }

    private void setAmount(double amount) {
	if (amount <= 0.00) {
	    throw new IllegalArgumentException(
		    "Amount cannot be inferior or equal to zero");
	}
	this.amount = amount;
    }

    private void setTimestamp(LocalDate timestamp) {
	this.timestamp = timestamp;
    }
}
