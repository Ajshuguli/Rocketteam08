package ec.espe.edu.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Account {

    private float balanceInquiry;
    private float withdrawals;
    private float savings;
    private float current;
    private float CDT;
    private float transfer;
    

    @Override
    public String toString() {
        return "Account{" + "balanceInquiry=" + balanceInquiry + ", withdrawals=" + withdrawals + ", savings=" + savings + ", current=" + current + ", CDT=" + CDT + ", transfer=" + transfer + '}';
    }
    
    

    public Account(float balanceInquiry, float withdrawals, float savings, float current, float CDT, float transfer) {
        this.balanceInquiry = balanceInquiry;
        this.withdrawals = withdrawals;
        this.savings = savings;
        this.current = current;
        this.CDT = CDT;
        this.transfer = transfer;
    }


    private void requestBalance() {

    }

    private void seewithdraws() {

    }

    private void transfer() {

    }
    private Guide guide(){
    return new Guide();
    }

    /**
     * @return the balanceInquiry
     */
    public float getBalanceInquiry() {
        return balanceInquiry;
    }

    /**
     * @param balanceInquiry the balanceInquiry to set
     */
    public void setBalanceInquiry(float balanceInquiry) {
        this.balanceInquiry = balanceInquiry;
    }

    /**
     * @return the withdrawals
     */
    public float getWithdrawals() {
        return withdrawals;
    }

    /**
     * @param withdrawals the withdrawals to set
     */
    public void setWithdrawals(float withdrawals) {
        this.withdrawals = withdrawals;
    }

    /**
     * @return the savings
     */
    public float getSavings() {
        return savings;
    }

    /**
     * @param savings the savings to set
     */
    public void setSavings(float savings) {
        this.savings = savings;
    }

    /**
     * @return the current
     */
    public float getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(float current) {
        this.current = current;
    }

    /**
     * @return the CDT
     */
    public float getCDT() {
        return CDT;
    }

    /**
     * @param CDT the CDT to set
     */
    public void setCDT(float CDT) {
        this.CDT = CDT;
    }

    /**
     * @return the transfer
     */
    public float getTransfer() {
        return transfer;
    }

    /**
     * @param transfer the transfer to set
     */
    public void setTransfer(float transfer) {
        this.transfer = transfer;
    }

}
