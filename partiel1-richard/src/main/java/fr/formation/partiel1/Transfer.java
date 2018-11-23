package fr.formation.partiel1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Richard Phonthibsvads
 */
public class Transfer {

    private double amount;

    private Account emitter;

    private Account beneficiary;

    LocalDate executionDate = LocalDate.now();Account

    // private List<Account> accounts = new ArrayList<>();
    /**
     * @param amount
     *                           type double
     * @param accountBeneficiary
     * @param accountEmitter
     * @param timestamp
     *                           type LocalDate
     */
    public Transfer(double amount, Account emmitter, Account beneficiary,
	    LocalDate timestamp) {
	setAmount(amount);
	setExecutionDate(timestamp);
	setEmitter(emmitter);
	setBeneficiary(beneficiary);
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
    public LocalDate getExecutionDate() {
	return executionDate;
    }

    /**
     * Method getAccounts() returns a list of Account accounts
     *
     * @return accounts
     */
    public List<Account> getAllAccounts() {
	// Defensive copy
	return Collections.unmodifiableList(accounts);
    }
    // public boolean addAccount(Account account) {
    // Objects.requireNonNull(account, "Currency is required");
    // return accounts.add(account);
    // }

    public Account getEmitter() {
	return emitter;
    }

    public Account getBeneficiary() {
	return beneficiary;
    }

    private void setAmount(double amount) {
	if (amount <= 0.00) {
	    throw new IllegalArgumentException(
		    "Amount cannot be inferior or equal to zero");
	}
	this.amount = amount;
    }

    private void setExecutionDate(LocalDate timestamp) {
	executionDate = timestamp;
    }

    private void setEmitter(Account emitter) {
	this.emitter = emitter;
    }

    private void setBeneficiary(Account beneficiary) {
	this.beneficiary = beneficiary;
    }
}
