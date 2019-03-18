class Week17Functions
{
	int Average( int [] inputArray )
	{
		// return the integer average of the values in inputArray
		// empty array should return an average of zero
		
		if(inputArray.length == 0) return 0;
		
		int total = 0;
		
		for(int i = 0; i < inputArray.length; i++)
		{
			total += inputArray[i];
		}
		
		return total / inputArray.length;
	}

	float Range( float [] inputArray )
	{
		// return the difference between the largest and smallest values in
		// inputArray. Empty array returns zero. All input values lie bewtween
		// -1000.0f and 1000.0f
		
		if(inputArray.length == 0) return 0;
		
		if(inputArray.length == 1) return 0;

		
		float max = inputArray[0];
		float min = inputArray[0];
		
		for(int i = 0; i < inputArray.length; i++)
		{
			if(inputArray[i] > max)
			{
				max = inputArray[i];
			}
			else if(inputArray[i] < min)
			{
				min = inputArray[i];
			}
		}
		
		
		return max -+ min;
	}

	int Collatz( int i )
	{
		// if i is even, return i/2, otherwise return 3*i + 1
		
		if(i%2 == 1)
		{
			return (3*i)+1;
		}
		else
		{
			return i/2;
		}
	}

	int CompoundInterest( int capital, int ratePC, int years )
	{
		// return the new capital if compound interest at ratePC % per year is accumlated
		// by an integer amount (capital) over an integer number of years (years).
		// return value is rounded to *nearest* integer
		
		if(ratePC == 0) return capital;
		
		float converted_rate_pc = ratePC/100;
		
		converted_rate_pc = converted_rate_pc*years;
		
		float converted_capital = (float) capital;
		
		System.out.println(converted_rate_pc);
		System.out.println(converted_capital);

		
		return (int) (converted_capital * converted_rate_pc);
	}
}
