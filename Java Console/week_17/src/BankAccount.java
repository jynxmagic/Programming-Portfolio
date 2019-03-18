
public class BankAccount {

	public int Balance(int deposit, int years)
	{
		if(deposit <= 0) return -1;
		if(deposit > 50000) return -1;
		if(years <= 0) return -1;
		if(years > 10) return -1;
		
		float interest_rate = 0;
		
		
		if(deposit >= 1 && deposit <= 1000) interest_rate = 0.5f;
		if(deposit > 1000 && deposit <= 10000) interest_rate = 1.5f;
		if(deposit > 10000 && deposit <= 50000) interest_rate = 2.5f;

		float conv_rate = interest_rate/100;
		float fcapital = (float) deposit;
		for(int i = 0; i < years; i++)
		{
			fcapital += fcapital * conv_rate;
		}
		
		return Math.round(fcapital);
	}
	
}
