public class Account {
  String accountNumber;
  int balance;
  public String toString() {
    return "¥¥" + this.balance + "(口座番号=" + this.accountNumber + ")";
  }
  public boolean equals(object o) {
    if (this == o) {return true;}
    if (o instanceof Account) {
      Account a = (Account) o;
      String ac1 = this.accountNumber.trim();
      String ac2 = a.accountNumber.trim();
      if (ac1.equals(ac2)) {
        return true;
      }
    }
    return false;
  }
}
