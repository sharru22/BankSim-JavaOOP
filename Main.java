public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Sharmin", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.showBalance();
        acc1.showTransactionHistory();

        System.out.println("\n--- Savings Account Demo ---");
        SavingsAccount sAcc = new SavingsAccount("Sharmin", 10000, 5);
        sAcc.deposit(5000);
        sAcc.withdraw(2000);
        sAcc.showBalance();
        sAcc.addInterest();
        sAcc.showTransactionHistory();
    }
}
