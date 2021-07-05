
public class Constructors {
	
	public Constructors(int value) {
		System.out.println(value);
	}
	
	public Constructors() {
		System.out.println("Dafault Constructor ran");
    }
	
	public static void main(String[] args) {
		Constructors c = new Constructors(5839);
		
		// use the no-args Constructor
		Constructors cNoArg = new Constructors();
		
	}
}
