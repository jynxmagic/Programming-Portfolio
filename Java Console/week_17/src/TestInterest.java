
public class TestInterest {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		
		int [] deposit = {1, 1000, 1001, 10000, 10001, 50000, 0, 50001, 1000, 1000};
		int [] years = {1, 10, 1, 10, 5, 10, 1, 10, 0, 11};
		int [] output = {1, 1051, 1016, 11605, 11315, 64004, -1, -1, -1, -1};

		int numTestCases = deposit.length;
		System.out.println("***********\nTesting Balance Interest ");
		int passed = 0;
		for ( int i = 0; i < numTestCases; i++ )
		{
			int result = ba.Balance(deposit[i], years[i]);
			if ( result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing Balance Interest - passed "+passed+" out of "+numTestCases);

	}

}
