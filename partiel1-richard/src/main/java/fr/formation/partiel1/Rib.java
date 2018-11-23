package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author Richard Phonthibsvads
 */
public class Rib {

    private String bankCode;

    private String counterCode;

    private String accountNum;

    private String ribKey;

    /**
     * @param bankCode
     *                    type String
     * @param counterCode
     *                    type String
     * @param accountNum
     *                    type String
     * @param ribKey
     *                    type String
     */
    public Rib(String bankCode, String counterCode, String accountNum,
	    String ribKey) {
	setBankCode(bankCode);
	setCounterCode(counterCode);
	setAccountNum(accountNum);
	setRibKey(ribKey);
    }

    /**
     * Method getBankCode() returns String bankCode
     *
     * @return bankCode
     */
    public String getBankCode() {
	return bankCode;
    }

    /**
     * Method getCounterCode() returns String counterCode
     *
     * @return counterCode
     */
    public String getCounterCode() {
	return counterCode;
    }

    /**
     * Method getAccontNum() returns String accountNum
     *
     * @return accountNum
     */
    public String getAccountNum() {
	return accountNum;
    }

    /**
     * Method getRibKey() returns String ribKey
     *
     * @return ribKey
     */
    public String getRibKey() {
	return ribKey;
    }

    private void setBankCode(String bankCode) {
	Objects.requireNonNull(bankCode);
	this.bankCode = bankCode;
    }

    private void setCounterCode(String counterCode) {
	Objects.requireNonNull(counterCode);
	this.counterCode = counterCode;
    }

    private void setAccountNum(String accountNum) {
	Objects.requireNonNull(accountNum);
	this.accountNum = accountNum;
    }

    private void setRibKey(String ribKey) {
	Objects.requireNonNull(ribKey);
	this.ribKey = ribKey;
    }
}
