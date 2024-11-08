
package user;

public class Transaction{
    int accid;
    int transid;
    int tranamt;
    String transtype;
    String date;

    public Transaction(int accid, int transid, int tranamt, String transtype, String date) {
        this.accid = accid;
        this.transid = transid;
        this.tranamt = tranamt;
        this.transtype = transtype;
        this.date = date;
    }

    public void displayTransaction() {
        System.out.println("Account ID: " + accid);
        System.out.println("Transaction ID: " + transid);
        System.out.println("Transaction Amount: " + tranamt);
        System.out.println("Transaction Type: " + transtype);
        System.out.println("Date: " + date);
    }
}