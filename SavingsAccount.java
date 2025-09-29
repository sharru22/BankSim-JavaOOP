public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {
        System.out.println("Processing withdrawal from Savings Account...");
        super.withdraw(amount);
    }

    // Add Interest
    public void addInterest() {
        double interest = (interestRate / 100) * getBalance();
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}