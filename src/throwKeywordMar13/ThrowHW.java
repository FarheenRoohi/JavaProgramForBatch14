package throwKeywordMar13;

public class ThrowHW {
	int balance = 30000;

	public static void main(String[] args) {
      ThrowHW  t = new ThrowHW();
      t.withdraw(35000);
	}
    void withdraw(int amount) {
    	if(balance<amount) {
    	throw new LowBalanceAccountException();
    	}
    	else {
    		balance = balance - amount;
    	}
    }
}
