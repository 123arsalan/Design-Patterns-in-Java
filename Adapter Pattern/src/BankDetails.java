/**
 * Created by glab on 10/15/16.
 */
public class BankDetails {
    private String bankName;
    private String accountHolderName;
    private long accountNumber;

    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccHolderName() {
        return accountHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accountHolderName = accHolderName;
    }
    public long getAccNumber() {
        return accountNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accountNumber = accNumber;
    }
}
