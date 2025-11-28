package PackageService;

public class Cryptocoin {
    
    private String name;
    private double price;
    private double amount;

    // Δομητής
    public Cryptocoin(String name, double price, double amount) {

        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    // Συναρτήσεις Getter
    public String GetName() {

        return (this.name);
    }

    public double GetPrice() {

        return (this.price);
    }

    public double GetAmount() {

        return (this.amount);
    }

    public void UpdatePortfolioBalance(double price) {

        this.amount -= price;
    }
}
