package throwKeywordMar13;

public class LowBalanceAccountException extends RuntimeException{
	LowBalanceAccountException(){
		super("Low Balance In Account");
	}
}
