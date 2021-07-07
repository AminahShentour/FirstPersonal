
public class ExampleOne {
	
	public static void main(String[] args) {
	//create some dummy data for our method
    int input = 5;
    
	Factorial fact =  new Factorial();
	
	//call your method here
	
	System.out.println(fact(input));
  }

public static int fact (int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
	    int result = n * fact(n-1);
	    return result;
}
}
		

