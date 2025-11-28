package PackageService;

import java.util.Scanner;

public class SignUp implements iSignProcess {
    
    public void SignMethodProcess(Scanner scanner, User user_data) {
        
        // Στοιχεία λογαριασμού
        String username = UsernameInput(scanner);
        user_data.GetAccountData().SetUsername(username);        
        String password = PasswordInput(scanner);
        user_data.GetAccountData().SetPassword(password);
        String email = EMailInput(scanner);
        user_data.GetAccountData().SetEMail(email);
    }

    public String UsernameInput(Scanner scanner) {

        String username_input;
        boolean valid_username = false;

        // Εγκυρότητα ονόματος χρήστη
        do {
            System.out.print("Username: ");
            username_input = scanner.nextLine();
            if (username_input.matches("^[a-zA-Z][a-zA-Z0-9_]{2,15}$")) {
                valid_username = true;
            } else if (!username_input.matches("^[a-zA-Z][a-zA-Z0-9_]{2,15}$")) {
                valid_username = false;
                System.out.println("Invalid username");
            }
        } while (valid_username == false);
        return(username_input);
    }

    public String PasswordInput(Scanner scanner) {
        
        String password_input;
        boolean valid_password = false;

        // Εγκυρότητα κωδικού πρόσβασης
        do {
            System.out.print("Password: ");
            password_input = scanner.nextLine();
            if (password_input.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
                valid_password = true;
            } else {
                valid_password = false;
                System.out.println("Invalid password. It must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            }
        } while (!valid_password);
        return (password_input);
    }
    
    public String EMailInput(Scanner scanner) {
        
        String email_input;
        boolean valid_email = false;

        // Εγκυρότητα email χρήστη
        do {
            System.out.print("Email: ");
            email_input = scanner.nextLine();
            if (email_input.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                valid_email = true;
            } else {
                valid_email = false;
                System.out.println("Invalid email format.");
            }
        } while (!valid_email);
        return (email_input);
    }
}
