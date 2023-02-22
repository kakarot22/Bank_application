package bankaccountapp;

public class Checking extends Account
{
    // List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;

    // constructor to initialize checking account properties

    public Checking(String name, String sSN, double initDeposit)
    {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate()
    {
        rate = getBaseRate() * 0.15;
    }

    // List any methods specific to the checking account
    private void setDebitCard()
    {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));;
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo()
    {
        System.out.println("Account type: Checking account");
        super.showInfo();
        System.out.println("\tYour Checking account features :");
        System.out.println("\tDebit Card number: " + debitCardNumber);
        System.out.println("\tDebit Card PIN: " + debitCardPin);

    }
}
