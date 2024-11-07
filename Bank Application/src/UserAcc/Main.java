package UserAcc;

import java.util.Scanner;

class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                                    
        System.out.println("Welcome to Bank Application");
        System.out.println("choose your role:");
        System.out.println("1. Admin");
        System.out.println("2. User");
        int roleChoice = scanner.nextInt();
        scanner.nextLine(); 

        if (roleChoice == 1) {
         
            System.out.println("\nCreate Admin Account");
            System.out.print("Enter Admin ID: ");
            int adminId = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Enter Admin Username: ");
            String adminUsername = scanner.nextLine();

            System.out.print("Set Admin Password: ");
            String adminPassword = scanner.nextLine();

            Admin admin = new Admin(adminId, adminUsername, adminPassword);

           
            if (!Admin.adminLogin(admin, scanner)) {
                System.out.println("Exiting program...");
                scanner.close();
                return; 
            }

            System.out.println("\nAdmin login successful. You can now manage users and settings.");

          
            scanner.close();
            return; 

        } else if (roleChoice == 2) {
        
            System.out.println("\nCreate a New User Account");
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Account Number: ");
            int accountnum = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Account Type (e.g., Savings, Checking): ");
            String accounttype = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = scanner.nextLong();

            System.out.print("Enter Initial Balance: ");
            long balance = scanner.nextLong();
            scanner.nextLine();  

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Branch: ");
            String branch = scanner.nextLine();

            System.out.print("Set Password: ");
            String password = scanner.nextLine();

            Account account = new Account(accountnum, accounttype,password, phone, balance, address, branch, password, username, false, accountnum, accountnum, balance);

           
            if (login(account, scanner)) {
                performAction(account, scanner);
            }

        } else {
            System.out.println("Invalid choice! Exiting...");
            scanner.close();
            return; 
        }

        scanner.close();
    }

   
    public static boolean login(Account account, Scanner scanner) {
        System.out.print("\nTo access your account, enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(account.getPassword())) {
            account.setLoggedIn(true);
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Incorrect password. Access denied.");
            return false;
        }
    }

   
    public static void logout(Account account) {
        account.setLoggedIn(false);
        System.out.println("You have been logged out.");
    }

    
    public static void performAction(Account account, Scanner scanner) {
        boolean exit = false;

        while (!exit && account.isLoggedIn()) {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Update Account Details");
            System.out.println("3. Set New Password");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter new phone number: ");
                    long newPhone = scanner.nextLong();
                    scanner.nextLine();  
                    account.setPhone(newPhone);

                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    account.setAddress(newAddress);

                    System.out.println("Account details updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    account.setPassword(newPassword);
                    System.out.println("Password updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    scanner.nextLine(); 
                    account.setBalance(account.getBalance() + depositAmount);
                    System.out.println("Amount deposited successfully. New balance: " + account.getBalance());
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    scanner.nextLine();  
                    if (withdrawAmount > account.getBalance()) {
                        System.out.println("Insufficient balance.");
                    } else {
                        account.setBalance(account.getBalance() - withdrawAmount);
                        System.out.println("Amount withdrawn successfully. New balance: " + account.getBalance());
                    }
                    break;
                case 6:
                    logout(account);
                    if (login(account, scanner)) {
                        continue;
                    } else {
                        exit = true;
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting.,.");
                    break;
                default:
                    System.out.println("Invalid ,Please try again.");
                    break;
            }
        }
    }
}
