
public class Rational implements Comparable<Rational> {
	private int numerator, denominator; 
	
	public Rational (int numer, int denom) {
		if (denom == 0)
			denom = 1;
		
		if (denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}
	
		numerator = numer;
		denominator = denom;
		
		reduce();
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Rational add (Rational op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		
		return new Rational (sum, commonDenominator);
	}
	
	private int gcd (int num1, int num2) {
		while (num1 != num2)
			if (num1 > num2)
				num1 -= num2;
			else
				num2 -= num1;
		
		return num1;
	}
	
	private void reduce() {
		if (numerator != 0) {
			int common = gcd (Math.abs(numerator), denominator);
			
			numerator = numerator / common;
			denominator = denominator / common;
		}
			
	}
	
	public double getFloat () {
		return numerator/denominator;
	}
	
	public int compareTo (Rational r2) {
		Rational r1 = this;
		if (r1.getFloat() == r2.getFloat()) {
			if (r1.getFloat() - r2.getFloat() <= 0.0001 || r2.getFloat() - r1.getFloat() <= 0.0001)
				return 0;
			else
				return 21;
		}
		else if (r1.getFloat() < r2.getFloat())
			return -1;
		else 
			return +1;
	}
	
}
