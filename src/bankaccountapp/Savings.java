package bankaccountapp;

public class Savings extends Account
{
    // List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit)
    {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();
    }

    @Override
    public void setRate()
    {
        rate = getBaseRate() - 0.25;
    }

    // List any methods specific to savings account
    private void setSafetyDepositBox()
    {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo()
    {
        System.out.println("Account type: Savings account");
        super.showInfo();
        System.out.println("\tYour Saving account features :");
        System.out.println("\tSafety Deposit Box ID: " + safetyDepositBoxID);
        System.out.println("\tSafety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
