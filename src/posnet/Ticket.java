package posnet;

public class Ticket {
    private String name;
    private double totalAmount;
    private double payByFee;

    public Ticket(String name, double totalAmount, double payByFee) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.payByFee = payByFee;
    }
}
