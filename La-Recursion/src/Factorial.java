
public class Factorial {

	public long fact (int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
	    long result = n * fact(n-1);
	    return result;
		
		
	}
}
