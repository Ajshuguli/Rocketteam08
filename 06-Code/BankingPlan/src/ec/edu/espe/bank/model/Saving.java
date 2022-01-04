package ec.edu.espe.bank.model;

import java.util.ArrayList;

/**
 *
 * @author RocketTeam
 */
public class Saving {

    private String name;
    private float amount;
    private String accountNumber;
    private ArrayList<Money> money;
    private ArrayList<Profit> profits;

    public Saving(String name,float amount,String accountNumber, ArrayList<Money> money, ArrayList<Profit> profits) {
        this.name = name;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.money = money;
        this.profits = profits;
    }

    @Override
    public String toString() {
        return "Saving{" + "name=" + getName() + ", amount=" + getAmount() + ", accountNumber=" + getAccountNumber() + ", money=" + getMoney() + ", profits=" + getProfits() + '}';
    }

    
    public float deposit() {
        
        return 0.F;
    }

    public float withdraw() {
        return 0.F;
    }

    public float transfer() {
        return 0.F;
    }

    public Interest estimateInterest() {
        return  new Interest();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
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

    /**
     * @return the money
     */
    public ArrayList<Money> getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(ArrayList<Money> money) {
        this.money = money;
    }

    /**
     * @return the profits
     */
    public ArrayList<Profit> getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(ArrayList<Profit> profits) {
        this.profits = profits;
    }
    
    
}
