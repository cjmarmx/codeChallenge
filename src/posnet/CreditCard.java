package posnet;

public class CreditCard{
    private String bankName;
    private String cardNumber;
    private double balance;
    private EntityFinancial entityFinancial;
    private Person holder;

    public CreditCard(String bankName, String cardNumber, double balance, EntityFinancial entityFinancial, Person holder) {
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.entityFinancial = entityFinancial;
        this.holder = holder;
    }
}

