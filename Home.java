package PackageService;

import java.util.Scanner;

public class Home {
    
    public void HomeSections(Scanner scanner, User user_data) throws InvalidServiceSection, InvalidCryptocoinAmount {

        // Επιλογές εφαρμογής
        PortfolioConnection connect_portfolio = new PortfolioConnection();
        Order pay_order = new Order();
        
        System.out.println("Connect Portfolio (1) | Pay Order (2) | Exit (3)");
        System.out.print("Select section (1-2): ");
        int service_section = scanner.nextInt();
        // Επιλογή υπηρεσίας εφαρμογής
        while (service_section != 3) {
            if (service_section < 1 || service_section > 3) {
                throw new InvalidServiceSection("We're sorry, but you ave input an invalid service section");
            } else {
                if (service_section == 1) {
                    connect_portfolio.CryptocoinExchangeProcess(scanner, user_data); // Σύνδεση πορτφολιού
                } else if (service_section == 2) {
                    if (user_data.GetPortfolioData().GetCryptocoin() == null) {
                        System.out.println("You haven't been connected to your portfolio");
                    } else {
                        pay_order.CryptocoinExchangeProcess(scanner, user_data); // Παραγγελία προιόντος
                    }
                }
            }
            System.out.println("Connect Portfolio (1) | Pay Order (2) | Exit (3)");
            System.out.print("Select section (1-2): ");
            service_section = scanner.nextInt();
        }
    }
}
