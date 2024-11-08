
package user;

public class Account {
    private int accountnum;
    private String accounttype;
    private long phone;
    private long balance;
    private String address;
    private String branch;
    private String password;
    private String username;
    private boolean isLoggedIn;

    public Account(int accountnum, String accounttype, long phone, long balance, String address, String branch, String password, String username) {
        this.accountnum = accountnum;
        this.accounttype = accounttype;
        this.phone = phone;
        this.balance = balance;
        this.address = address;
        this.branch = branch;
        this.password = password;
        this.username = username;
        this.isLoggedIn = false;
    }

    // Getter and Setter methods
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public int getAccountnum() { return accountnum; }
    public void setAccountnum(int accountnum) { this.accountnum = accountnum; }
    public String getAccounttype() { return accounttype; }
    public void setAccounttype(String accounttype) { this.accounttype = accounttype; }
    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }
    public long getBalance() { return balance; }
    public void setBalance(long balance) { this.balance = balance; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public boolean isLoggedIn() { return isLoggedIn; }
    public void setLoggedIn(boolean loggedIn) { this.isLoggedIn = loggedIn; }
}