public class Main {
    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("** ATM Machine Code by Suraj **");
        System.out.println("*******************************");
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance=> 1000
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
/* Here you can run the program */