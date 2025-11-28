package PackageService;

import java.util.Scanner;

public class SignAccount {
    
    public static void main(String[] args) throws InvalidSignMethod, InvalidServiceSection, InvalidCryptocoinAmount {

        Scanner scanner = new Scanner(System.in);

        User user_data = new User(); // Στοιχεία χρήστη

        Home home_sections = new Home(); // Είσοδος στην εφαρμογή

        // Τρόποι σύνδεσης στην εφαρμογή
        SignUp sign_up = new SignUp();
        SignIn sign_in = new SignIn();

        System.out.println("Sign-Up (1) | Sign-In (2)");
        System.out.print("Select sign method (1-2): ");
        int sign_method = scanner.nextInt();
        // Επιλογή τρόπου σύνδεσης
        if (sign_method < 1 || sign_method > 2) {
            throw new InvalidSignMethod("We're sorry, but you ave input an invalid sign option");
        } else {
            if (sign_method == 1) {
                sign_up.SignMethodProcess(scanner, user_data); // Εγγραφή χρήστη
            } else if (sign_method == 2) {
                sign_in.SignMethodProcess(scanner, user_data); // Σύνδεση χρήστη
            }
        }
        home_sections.HomeSections(scanner, user_data);
    }
}
