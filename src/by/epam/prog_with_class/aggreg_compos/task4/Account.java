package by.epam.prog_with_class.aggreg_compos.task4;

public class Account  {

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", client='" + client + '\'' +
                ", amount=" + amount +
                ", block=" + block +
                '}';
    }

    private Long number;
    private String client;
    private double amount;
    private boolean block;

    public Account(Long number, String client, double amount, boolean block) {
        this.number = number;
        this.client = client;
        this.amount = amount;
        this.block = block;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }
}
