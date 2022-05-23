package base;

public abstract interface Income {

    public  abstract void income(int quantity, double price, double income);

    void netProfit(double income, double tax, double netProfit);
}
