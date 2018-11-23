package fr.formation.partiel1;

/**
 * @author Richard Phonthibsvads
 */
public class Account {

    private String countryCode;

    private String controlKey;

    private Rib rib;

    /**
     * @param countryCode
     *                    type String
     * @param controlKey
     *                    type String
     * @param rib
     *                    type Rib Class
     */
    public Account(String countryCode, String controlKey, Rib rib) {
	setCountryCode(countryCode);
	setControlKey(controlKey);
	setRib(rib);
    }

    /**
     * Method getCountryCode() returns String countryCode
     *
     * @return countryCode
     */
    public String getCountryCode() {
	return countryCode;
    }

    /**
     * Method getControlKey() returns String controlkey
     *
     * @return controlKey
     */
    public String getControlKey() {
	return controlKey;
    }

    /**
     * Method getCountryCode() returns Rib rib
     *
     * @return rib
     */
    public Rib getRib() {
	return rib;
    }

    private void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    private void setControlKey(String controlKey) {
	this.controlKey = controlKey;
    }

    private void setRib(Rib rib) {
	this.rib = rib;
    }
}
