package PackageService;

import java.util.Scanner;

public class PortfolioConnection implements iCryptocoinService {
    
    public void CryptocoinExchangeProcess(Scanner scanner, User user_data) {

        System.out.print("Wallet password: ");
        String wallet_code = ValidateWalletCode(scanner);
        user_data.GetPortfolioData().SetCode(wallet_code);
        System.out.println("Wallet connected successfully");
        
        // Σύνδεση νομισμάτων
        user_data.GetPortfolioData().GetCryptocoin()[0] = new Cryptocoin("Bitcoin (BTC)", 93263.28, 0.0032);
        user_data.GetPortfolioData().GetCryptocoin()[1] = new Cryptocoin("Ethereum (ETH)", 3250.75, 0.15);
        user_data.GetPortfolioData().GetCryptocoin()[2] = new Cryptocoin("Binance Coin (BNB)", 585.40, 1.2);
        user_data.GetPortfolioData().GetCryptocoin()[3] = new Cryptocoin("Ripple (XRP)", 0.52, 150.0);
        user_data.GetPortfolioData().GetCryptocoin()[4] = new Cryptocoin("Cardano (ADA)", 0.45, 200.0);
        user_data.GetPortfolioData().GetCryptocoin()[5] = new Cryptocoin("Solana (SOL)", 102.30, 2.5);
        user_data.GetPortfolioData().GetCryptocoin()[6] = new Cryptocoin("Polkadot (DOT)", 6.85, 15.0);
        user_data.GetPortfolioData().GetCryptocoin()[7] = new Cryptocoin("Dogecoin (DOGE)", 0.12, 500.0);
        user_data.GetPortfolioData().GetCryptocoin()[8] = new Cryptocoin("Avalanche (AVAX)", 34.67, 8.0);
        user_data.GetPortfolioData().GetCryptocoin()[9] = new Cryptocoin("Polygon (MATIC)", 0.78, 100.0);
        user_data.GetPortfolioData().GetCryptocoin()[10] = new Cryptocoin("Litecoin (LTC)", 78.90, 3.2);
        user_data.GetPortfolioData().GetCryptocoin()[11] = new Cryptocoin("Chainlink (LINK)", 14.25, 12.0);
        user_data.GetPortfolioData().GetCryptocoin()[12] = new Cryptocoin("Stellar (XLM)", 0.11, 300.0);
        user_data.GetPortfolioData().GetCryptocoin()[13] = new Cryptocoin("Bitcoin Cash (BCH)", 425.60, 1.8);
        user_data.GetPortfolioData().GetCryptocoin()[14] = new Cryptocoin("Algorand (ALGO)", 0.18, 150.0);
        user_data.GetPortfolioData().GetCryptocoin()[15] = new Cryptocoin("VeChain (VET)", 0.03, 800.0);
        user_data.GetPortfolioData().GetCryptocoin()[16] = new Cryptocoin("Cosmos (ATOM)", 8.45, 20.0);
        user_data.GetPortfolioData().GetCryptocoin()[17] = new Cryptocoin("Filecoin (FIL)", 5.65, 25.0);
        user_data.GetPortfolioData().GetCryptocoin()[18] = new Cryptocoin("TRON (TRX)", 0.12, 400.0);
        user_data.GetPortfolioData().GetCryptocoin()[19] = new Cryptocoin("Ethereum Classic (ETC)", 26.40, 10.0);
        user_data.GetPortfolioData().GetCryptocoin()[20] = new Cryptocoin("Monero (XMR)", 165.80, 1.5);
        user_data.GetPortfolioData().GetCryptocoin()[21] = new Cryptocoin("Tezos (XTZ)", 0.95, 50.0);
        user_data.GetPortfolioData().GetCryptocoin()[22] = new Cryptocoin("EOS (EOS)", 0.58, 80.0);
        user_data.GetPortfolioData().GetCryptocoin()[23] = new Cryptocoin("Aave (AAVE)", 86.30, 0.8);
        user_data.GetPortfolioData().GetCryptocoin()[24] = new Cryptocoin("Compound (COMP)", 54.20, 1.2);
        user_data.GetPortfolioData().GetCryptocoin()[25] = new Cryptocoin("Uniswap (UNI)", 6.15, 15.0);
        user_data.GetPortfolioData().GetCryptocoin()[26] = new Cryptocoin("Shiba Inu (SHIB)", 0.000008, 5000000.0);
        user_data.GetPortfolioData().GetCryptocoin()[27] = new Cryptocoin("Cronos (CRO)", 0.09, 200.0);
        user_data.GetPortfolioData().GetCryptocoin()[28] = new Cryptocoin("NEAR Protocol (NEAR)", 3.25, 30.0);
        user_data.GetPortfolioData().GetCryptocoin()[29] = new Cryptocoin("Fantom (FTM)", 0.35, 120.0);
    }

    public String ValidateWalletCode(Scanner scanner) {

        String code;
        boolean valid_code = false;
        do {
            System.out.print("Wallet password: ");
            code = scanner.nextLine();
            if (!code.matches("^(bc1|[13])[a-zA-HJ-NP-Z0-9]")) {
                valid_code = false;
                System.out.println("Invalid wallet code");
            } else if (code.matches("^(bc1|[13])[a-zA-HJ-NP-Z0-9]")) {
                valid_code = true;
            }
        } while (valid_code == false);
        return(code);
    }
}
