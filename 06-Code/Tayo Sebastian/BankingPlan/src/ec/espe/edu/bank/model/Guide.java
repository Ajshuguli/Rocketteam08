package ec.espe.edu.bank.model;

/**
 *
 * @author RockeTeam
 */
public class Guide {

    private String accountManagement;
    private String savingsAccount;
    private String currentAccount;
    private String cdtAccount;
    private String interestManagement;

    public Guide(String accountManagement, String savingsAccount, String currentAccount, String cdtAccount, String interestManagement) {
        this.accountManagement = accountManagement;
        this.savingsAccount = savingsAccount;
        this.currentAccount = currentAccount;
        this.cdtAccount = cdtAccount;
        this.interestManagement = interestManagement;
    }

    
    public void learnAccount() {

    }

    public void learnSavings() {

    }

    public void learnChecking() {

    }

    public void learnCdt() {

    }

    public void learnInterest() {

    }

    /**
     * @return the accountManagement
     */
    public String getAccountManagement() {
        return accountManagement;
    }

    /**
     * @param accountManagement the accountManagement to set
     */
    public void setAccountManagement(String accountManagement) {
        this.accountManagement = accountManagement;
    }

    /**
     * @return the savingsAccount
     */
    public String getSavingsAccount() {
        return savingsAccount;
    }

    /**
     * @param savingsAccount the savingsAccount to set
     */
    public void setSavingsAccount(String savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    /**
     * @return the currentAccount
     */
    public String getCurrentAccount() {
        return currentAccount;
    }

    /**
     * @param currentAccount the currentAccount to set
     */
    public void setCurrentAccount(String currentAccount) {
        this.currentAccount = currentAccount;
    }

    /**
     * @return the cdtAccount
     */
    public String getCdtAccount() {
        return cdtAccount;
    }

    /**
     * @param cdtAccount the cdtAccount to set
     */
    public void setCdtAccount(String cdtAccount) {
        this.cdtAccount = cdtAccount;
    }

    /**
     * @return the interestManagement
     */
    public String getInterestManagement() {
        return interestManagement;
    }

    /**
     * @param interestManagement the interestManagement to set
     */
    public void setInterestManagement(String interestManagement) {
        this.interestManagement = interestManagement;
    }
}
