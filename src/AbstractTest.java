abstract class Transaction {
    private Integer accountNumber;
    private Double balance;
    public abstract Boolean deposit(Double amount);
    public abstract Boolean transfer(SavingAccount toAccount, Double amount);
    public Transaction() {
    }
    public Transaction(Integer accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return String.format("Transaction [accountNumber=%s, balance=%s]", accountNumber, balance);
    }  

}

class SavingAccount extends Transaction{  
    

    public SavingAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public Boolean deposit(Double amount) {
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public Boolean transfer(SavingAccount toAccount, Double amount) {
        if (super.getBalance() > amount){
            toAccount.setBalance(toAccount.getBalance() + amount);
            super.setBalance(super.getBalance() - amount);
            return true;
        }else{
            return false;
        }
    }    
}

class CurrentAccount extends Transaction{  
    public CurrentAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public Boolean deposit(Double amount) {
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public Boolean transfer(SavingAccount toAccount, Double amount) {
        if (super.getBalance() > amount){
            toAccount.setBalance(toAccount.getBalance() + amount);
            super.setBalance(super.getBalance() - amount);
            return true;
        }else{
            return false;
        }
    }    
}


public class AbstractTest {
    public static void main(String[] args) {
        SavingAccount kumar =  new SavingAccount(875385, 1000.0);
        SavingAccount raja =  new SavingAccount(875390, 3000.0);
        kumar.deposit(3500.0);
        System.out.println(kumar.toString());
        System.out.println(raja.toString());
        System.out.println("*************************");
        boolean flag = kumar.transfer(raja, 500.0);
        if(flag){
            System.out.println("Transaction Success!");  
            System.out.println(kumar.toString());
            System.out.println(raja.toString());  
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
}