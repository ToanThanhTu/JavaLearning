import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Adelaide", false);
    }

}

class Bank {
    String name;
    ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,
                               String customerName,
                               double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName,
                    initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,
                                          String customerName,
                                          double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,
                    transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName,
                                 boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for " +
                    "branch " + branchName);
            for (BranchCustomer c : branch.getCustomers()) {
                System.out.printf("Customer: %s[%d]%n",
                        c.getName(),
                        branch.getCustomers().indexOf(c)+1);
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int i = 0; i < c.getTransactions().size(); i++) {
                        System.out.printf("[%d] Amount %.2f%n",
                                i+1,
                                c.getTransactions().get(i));
                    }
                }
            }
            return true;
        }
        return false;
    }
}

class Branch {
    private String name;
    ArrayList<BranchCustomer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public boolean newCustomer(String name,
                               double initialTransaction) {
        BranchCustomer customer = findCustomer(name);
        if (customer == null) {
            customers.add(new BranchCustomer(name,
                    initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name,
                                          double transaction) {
        BranchCustomer customer = findCustomer(name);
        if (customer != null) {
            customer.getTransactions().add(transaction);
            return true;
        }
        return false;
    }

    private BranchCustomer findCustomer(String name) {
        for (BranchCustomer c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BranchCustomer> getCustomers() {
        return customers;
    }
}

class BranchCustomer {
    String name;
    ArrayList<Double> transactions = new ArrayList<>();

    public BranchCustomer(String name, double initialTransaction) {
        this.name = name;
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}