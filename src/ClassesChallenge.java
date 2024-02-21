public class ClassesChallenge {

    public static void main(String[] args) {
//        BankAccount account = new BankAccount("12345", 10000.0,
//                "Trev", "toan@gnail.com", "012345567");

        BankAccount account = new BankAccount();

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
//        account.setAccountNumber("12345");
//        account.setCustomerName("Trev");
//        account.setBalance(10000);
//        account.setEmail("toan@gmail.com");
//        account.setPhoneNumber("012931312");

        account.deposit(5700);
        account.withdraw(2800);
        account.withdraw(28800);

        BankAccount timAccount = new BankAccount("Tim", "tim@email.com",
                "01234354654");
        System.out.println("AccountNo: " + timAccount.getAccountNumber() +
                "; name: " + timAccount.getCustomerName());
    }
}
