package fr.formation.partiel1;

public class Rib {

    private int bankCode;

    private int counterCode;

    private String accountNum;

    private int ribKey;

    public Rib(int bankCode, int counterCode, String accountNum, int ribKey) {
	setBankCode(bankCode);
	setCounterCode(counterCode);
	setAccountNum(accountNum);
	setRibKey(ribKey);
    }

    public int getBankCode() {
	return bankCode;
    }

    public int getCounterCode() {
	return counterCode;
    }

    public String getAccountNum() {
	return accountNum;
    }

    public int getRibKey() {
	return ribKey;
    }

    private void setBankCode(int bankCode) {
        this.bankCode = bankCode;

    private void setCounterCode(int counterCode) {
	this.counterCode = counterCode;
    }

    private void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
    }

    private void setRibKey(int ribKey) {
	this.ribKey = ribKey;
    }
}
