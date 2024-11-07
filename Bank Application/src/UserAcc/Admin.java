package UserAcc;

import java.util.Scanner;

public class Admin {
    int id;
    private String username;
    String password;
	public Object userName;

  
    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

  
    public static boolean adminLogin(Admin admin, Scanner scanner) {
        System.out.print("\nAdmin Login\nEnter Admin Password: ");
        String enteredPassword = scanner.nextLine();
        
        if (enteredPassword.equals(admin.getPassword())) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Incorrect admin password.");
            return false;
        }
    }
}
