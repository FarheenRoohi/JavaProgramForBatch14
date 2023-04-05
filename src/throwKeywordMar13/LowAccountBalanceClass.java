package throwKeywordMar13;

public class LowAccountBalanceClass extends RuntimeException{
	LowAccountBalanceClass(){
		super(" Low Balance Account");
	}
}
