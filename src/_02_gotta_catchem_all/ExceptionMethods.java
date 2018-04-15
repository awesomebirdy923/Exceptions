package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double x1, double x2) throws IllegalArgumentException {
		double quotient = x1 / x2;
		if (quotient == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return quotient;
		}
	}

	public String reverseString(String x) throws IllegalArgumentException{
		if (x.equals("")) {
			throw new IllegalArgumentException();
		} else {
			String newString = new StringBuilder(x).reverse().toString();
			return newString;
		}
	}

}
