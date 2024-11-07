package UserAcc;

public class Account {
    public long getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccounttype2() {
		return accounttype2;
	}

	public void setAccounttype2(String accounttype2) {
		this.accounttype2 = accounttype2;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber1() {
		return accountNumber1;
	}

	public void setAccountNumber1(int accountNumber1) {
		this.accountNumber1 = accountNumber1;
	}

	public long accountnum;
    public String accounttype;
    public String accounttype2;
    public long phone;
    public  long balance;
    public  String address;
    public  String branch;
    public String password;
    public  String username;
    public  boolean isLoggedIn;
	public int accountNumber;
	public int accountNumber1;
	public Object userName;

    public Account(long accountNo, String accounttype, String accounttype2, long phoneNo,double balance, String address,String branch, String password, String username, 
    		boolean isLoggedIn,int accountNumber,int accountNumber1, long phone) {
        this.accountnum  = (int) accountNo;
        this.accounttype = accounttype;
        this.accounttype2= accounttype2;
        this.phone       = phone;
        this.balance     = (long) balance;
        this.address     = address;
        this.branch      = (String)branch ;
        this.password    = password;
        this.username    = username;
        this.isLoggedIn  = false;
    }

	public Account(long accountNo, String username2, String accounttype3, double balance2, String pw, long phoneNo,
			String addrs, String branchname) {
		// TODO Auto-generated constructor stub
	}}
    