package dailyChallenge_jan22;

public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wnInteger = 6;
		double wnSQRT;
		if (wnInteger > 0)
		{
			wnSQRT = Math.sqrt(wnInteger);
			System.out.println("Square root of integer " + wnInteger + " is "+Math.round(wnSQRT));
		}
		else
		{
			System.out.println("Given number is not a Positive Integer");
		}

	}

}
