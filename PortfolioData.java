package PackageService;

public class PortfolioData {

    private String code;
    private Cryptocoin[] cryptocoins = new Cryptocoin[30];

    // Συναρτήσεις Setter - Getter
    public void SetCode(String code) {

        this.code = code;
    }

    public String GetCode() {

        return (this.code);
    }

    public void SetCryptocoin(Cryptocoin[] cryptocoins) {

        this.cryptocoins = cryptocoins;
    }

    public Cryptocoin[] GetCryptocoin() {

        return (this.cryptocoins);
    }
}