
public class ReturnTypes {
	
	public static void main(String[] args) {
		
		//create a class instance
		ReturnTypes rt = new ReturnTypes();
		
		//call your method here
		rt.returnNothing();
		System.out.println("The condition is " + rt.returnBoolean());
	}

	//create your method here
	public void returnNothing(){
		System.out.println("Inside of a void method");
	}
	
	//create a method to return boolean
	public boolean returnBoolean() {
		    return true;
	}
}
