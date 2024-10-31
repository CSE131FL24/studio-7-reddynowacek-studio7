package studio7;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public static void addFractions(Fraction a, Fraction b) {
		int commonDenom = a.denominator*b.denominator;
		int sumNum = (a.numerator*b.denominator) + (b.numerator*a.denominator);
		System.out.println(sumNum + "/" + commonDenom);
	}
	
	public static String multFractions(Fraction a, Fraction b) {
		int commonDenom = a.denominator*b.denominator;
		int multNum = a.numerator*b.numerator;
		return multNum + "/" + commonDenom;
	}
	
	public static String reciprocal(Fraction a) {
		return a.denominator + "/" + a.numerator;
	}
	
	public static String simplify(Fraction a) {
		int reducedNum = a.numerator;
		int reducedDem = a.denominator;
		for(int i = 12; i <= 1; i--) {
			if((reducedNum%i==0)) {
				reducedNum *= 1/i;
				reducedDem *= 1/i;
				System.out.println("hi");
			}
		}
		System.out.println(reducedDem%11);
		return reducedNum + "/" + reducedDem;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction a = new Fraction(11,88);
		Fraction b = new Fraction(3,7);
		Fraction.addFractions(a, b);
		System.out.println(Fraction.multFractions(a, b));
		System.out.println(Fraction.reciprocal(a));
		System.out.println(Fraction.simplify(a));
	}

}
