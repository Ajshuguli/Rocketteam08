
package ec.edu.espe.bank.model;

/**
 *
 * @author Rocket Team
 */
public class Checking {

    private String accountNumber;

    public Checking(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Checking{" + "accountNumber=" + accountNumber + '}';
    }
    
    

    public void deposit() {

    }

    public void advance() {

    }

    public void transfer() {

    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}


