package fr.formation.partiel1.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.Account;
import fr.formation.partiel1.Rib;
import fr.formation.partiel1.Transfer;

/**
 * @author Richard Phonthibsvads
 */
@Path("/bank")
public class TransferController {

    private final static List<Account> ACCOUNTS = new ArrayList<>();
    static {
	ACCOUNTS.add(callAccount1());
	ACCOUNTS.add(callAccount2());
	ACCOUNTS.add(callAccount3());
	ACCOUNTS.add(callAccount4());
	ACCOUNTS.add(callAccount5());
    }

    /**
     * @param accounts
     *                 type Account
     * @return all the accounts
     */
    @GET
    @Path("/all/ {accounts}")
    @Produces(MediaType.APPLICATION_JSON)
    public Transfer getAllAccounts(@PathParam("accounts") Account accounts) {
	for (int j = 0; j < accounts.length; j++) {
	    Account accounts = String.valueOf(accounts[i]);
	    return accounts;
	}
    }

    @SuppressWarnings("unused")
    private static Account callAccount1() {
	String codeCountry = "FR";
	String controlKey = "33";
	Rib rib = new Rib("30042", "00550", "0000246810R", "75");
	Account account = new Account(codeCountry, controlKey, rib);
	return account;
    }

    @SuppressWarnings("unused")
    private static Account callAccount2() {
	String codeCountry = "FR";
	String controlKey = "44";
	Rib rib = new Rib("30060", "00555", "0000137593H", "02");
	Account account = new Account(codeCountry, controlKey, rib);
	return account;
    }

    @SuppressWarnings("unused")
    private static Account callAccount3() {
	String codeCountry = "FR";
	String controlKey = "69";
	Rib rib = new Rib("30160", "00420", "0000777777T", "28");
	Account account = new Account(codeCountry, controlKey, rib);
	return account;
    }

    @SuppressWarnings("unused")
    private static Account callAccount4() {
	String codeCountry = "FR";
	String controlKey = "14";
	Rib rib = new Rib("37990", "07770", "0000975310W", "33");
	Account account = new Account(codeCountry, controlKey, rib);
	return account;
    }

    @SuppressWarnings("unused")
    private static Account callAccount5() {
	String codeCountry = "FR";
	String controlKey = "972";
	Rib rib = new Rib("30000", "005522", "0000554422U", "57");
	Account account = new Account(codeCountry, controlKey, rib);
	return account;
    }
}
