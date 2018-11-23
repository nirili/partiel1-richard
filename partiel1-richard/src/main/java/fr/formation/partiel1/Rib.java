package fr.formation.partiel1;

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

    public String getBankCode() {
	return bankCode;
    }

    public String getCounterCode() {
	return counterCode;
    }

    public String getAccountNum() {
	return accountNum;
    }

    public String getRibKey() {
	return ribKey;
    }

    private void setBankCode(String bankCode) {
	this.bankCode = bankCode;
    }

    private void setCounterCode(String counterCode) {
	this.counterCode = counterCode;
    }

    private void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
    }

    private void setRibKey(String ribKey) {
	this.ribKey = ribKey;
    }
}
