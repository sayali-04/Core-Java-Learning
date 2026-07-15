// Class demonstrating proper encapsulation
class Account
{
    // 🔒 Protects data by hiding it from direct access
    private String accountHolder;
    private double balance;

    // ✅ Public getter (controlled access to private data)
    public String getAccountHolder()
    {
        return accountHolder;
    }

    // ✅ Public setter (controlled access with flexibility for future validation)
    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    // ✅ Getter for balance
    public double getBalance()
    {
        return balance;
    }

    // 💰 Method to deposit money
    public void deposit(double amount)
    {
        // 🛡️ Allows data validation before modifying balance
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("You have deposited " + amount + " Rs.");
            System.out.println("New balance is: " + getBalance() + " Rs.");
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    // 💸 Method to withdraw money
    public void withdraw(double amount)
    {
        // 🛡️ Data validation: prevents negative balance
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("You have withdrawn " + amount + " Rs.");
            System.out.println("New balance is: " + getBalance() + " Rs.");
        }
        else
        {
            System.out.println("Invalid or Insufficient balance for withdrawal");
        }
    }
}

public class BankApp
{
    public static void main(String[] args)
    {
        // 👨‍💼 Creating object
        Account account = new Account();

        // 🚫 Cannot access private fields directly
        // account.balance = 10000; // ❌ Not allowed (Encapsulation)

        // ✅ Uses public setters and methods
        account.setAccountHolder("Deepak");

        // ✅ Proper access via methods ensures validation
        account.deposit(10000);      // Valid deposit
        account.withdraw(3000);      // Valid withdrawal

        account.deposit(-20000);     // Invalid deposit
        account.withdraw(100000);    // Invalid withdrawal (insufficient funds)
    }
}