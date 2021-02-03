package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double one, double two) throws IllegalArgumentException {
		if (two==0.0) {
			throw new IllegalArgumentException();
		}
		
		return one/two;
	}
	
	
	public static String reverseString(String s) throws IllegalStateException {
		String n="";
		if (s=="") {
			throw new IllegalStateException();
		}
		for (int i = s.length()-1; i >=0; i--) {
			
			n=n+s.charAt(i)+"";
		}
		return n;
	}
}
