import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by glab on 10/15/16.
 */
public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBackDetails() {
        try{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customerName = br.readLine();
            System.out.print("Enter the account number:");
            long accountNumber=Long.parseLong(br.readLine());
            System.out.print("Enter the bank name :");
            String bankName = br.readLine();

            setAccHolderName(customerName);
            setAccNumber(accountNumber);
            setBankName(bankName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreaditCard() {
        long accountNumber=getAccNumber();
        String accountHolderName=getAccHolderName();
        String bankName=getBankName();

        return ("Account Number : " + accountNumber + "\n Account Holder : " + accountHolderName + "\n Bank Name : " + bankName);
    }
}
