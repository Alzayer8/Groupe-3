import java.util.Scanner;

class Account {
    private String username;
    private String fullName;
    private String phoneNumber;
    private String dateOfBirth;
    private String email;
    private String password;

    public Account(String username, String fullName, String phoneNumber, String dateOfBirth, String email, String password) {
        this.username = username;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }

    public void displayAccountInfo() {
        System.out.println("\nAccount Created Successfully!");
        System.out.println("Username: " + username);
        System.out.println("Full Name: " + fullName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Email: " + email);
    }
}

public class CreateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a New Account");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Account account = new Account(username, fullName, phoneNumber, dateOfBirth, email, password);

        account.displayAccountInfo();

        scanner.close();
    }
}
