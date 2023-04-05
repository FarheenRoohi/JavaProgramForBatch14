package throwKeywordMar13;

public class Bank {
      int balance = 20000;
	public static void main(String[] args) {
       Bank b = new Bank();
       b.withdraw(25000);;
	}
  void withdraw(int amount) {
	  
	  if(balance<amount) {
	  throw new LowAccountBalanceClass();
	  }
	  else{
		  balance = balance - amount;
		  System.out.println();
	  }
  }
}
