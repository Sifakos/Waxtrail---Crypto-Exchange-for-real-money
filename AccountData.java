package PackageService;

public class AccountData {
    
    private String username; // Όνομα χρήστη
    private String password; // Κωδικός πρόσβασης χρήστη
    private String email; // Ε-Mail χρήστη

    // Συναρτήσεις Setter - Getter
    public void SetUsername(String username) {

        this.username = username;
    }

    public String GetUsername() {

        return (this.username);
    }

    public void SetPassword(String password) {

        this.password = password;
    }

    public String GetPassword() {

        return (this.password);
    }

    public void SetEMail(String email) {

        this.email = email;
    }

    public String GetEMail() {

        return (this.email);
    }
}
