package PackageService;

public class User {
    
    private AccountData waxtrail_data; // Στοιχεία χρήστη
    private PortfolioData portfolio_data; // Στοιχεία πορτφολίου χρήστη

    // Συναρτήσεις Setter - Getter
    public void SetAccountData(AccountData waxtrail_data) {

        this.waxtrail_data = waxtrail_data;
    }

    public AccountData GetAccountData() {

        return (this.waxtrail_data);
    }

    public void SetPortfolioData(PortfolioData portfolio_data) {

        this.portfolio_data = portfolio_data;
    }

    public PortfolioData GetPortfolioData() {

        return (this.portfolio_data);
    }
}