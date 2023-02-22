package bankaccountapp;

public interface IBaseRate
{
    // Write a method that returns the interests base rate
    default double getBaseRate()
    {
        return 2.5;
    }
}
