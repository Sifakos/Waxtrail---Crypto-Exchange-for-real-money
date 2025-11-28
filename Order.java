package PackageService;

import java.util.Scanner;

public class Order implements iCryptocoinService {
    
    public void CryptocoinExchangeProcess(Scanner scanner, User user_data) throws InvalidCryptocoinAmount {
        
        System.out.print("Order price: ");
        double order_price = scanner.nextDouble();
        int key_cryptocoin = SelectCryptocoin(scanner, user_data); // Επιλογή κρυπτονομίσματος
        CalculateOrderExchange(user_data, key_cryptocoin, order_price); // Ολοκλήρωση συναλλαγής
        System.out.println("Exchange was successfull, thank you for trusting us !!!");
    }

    public int SelectCryptocoin(Scanner scanner, User user_data) throws InvalidCryptocoinAmount {

        // Εμφάνιση κρυπτονομισμάτων 
        for (int i = 0; i < user_data.GetPortfolioData().GetCryptocoin().length; i ++) {
            if (user_data.GetPortfolioData().GetCryptocoin()[i].GetAmount() > 0) {
                System.out.println(user_data.GetPortfolioData().GetCryptocoin()[i]);
            }
        }

        // Αναζήτηση κρυπτονομίσματος
        System.out.print("Select cryptocoin for the exchange: ");
        String key_cryptocoin = scanner.nextLine();
        boolean found_cryptocoin = false;
        int i = 0;
        int pos = -1;
        while (i < user_data.GetPortfolioData().GetCryptocoin().length && found_cryptocoin == false) {
            if (user_data.GetPortfolioData().GetCryptocoin()[i].GetName().equals(key_cryptocoin)) {
                if (user_data.GetPortfolioData().GetCryptocoin()[i].GetAmount() == 0) {
                    throw new InvalidCryptocoinAmount("We're sorry, but you have selected an invalid cryptocoin");
                } else {
                    pos = i;
                    found_cryptocoin = true;
                }
            }
        }
        return(pos);
    }

    public void CalculateOrderExchange(User user_data, int cryptocoin_pos, double order_price) {

        double cryptocoin_price = order_price / user_data.GetPortfolioData().GetCryptocoin()[cryptocoin_pos].GetPrice();
        user_data.GetPortfolioData().GetCryptocoin()[cryptocoin_pos].UpdatePortfolioBalance(cryptocoin_price); // Ενημέρωση ποσού κρυπτονομίσματος
        
    }
}
