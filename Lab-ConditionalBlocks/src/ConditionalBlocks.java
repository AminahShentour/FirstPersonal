
public class ConditionalBlocks {
	
	public static void main(String[] args) {
		boolean firstcondition = false;
		boolean secondcondition = true;
		
		
		if (firstcondition) {
			System.out.println(" Inside the if statement");
			
		   if (secondcondition) { 
			System.out.println("Inside the nested if statement");
		}
     }else if (secondcondition){
    	 System.out.println(5);
     }else {
    	 System.out.println(" Inside the else statement");
    	 
     }
     
		System.out.println("Outside of the if statement");
   }
    
}


