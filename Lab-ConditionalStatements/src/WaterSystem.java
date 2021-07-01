
public class WaterSystem {
	
	public static void main(String[] args){
		int percipitation = 0;
		int waterOutput = 0;
		
		//start an if-statement
		if (percipitation < 20) {
			waterOutput = 30;
		}else if (percipitation < 31) {
			waterOutput = 10;
		}else if (percipitation < 56) {
			waterOutput = 0;
		} else {
			waterOutput = 0;
		}
		System.out.println("The water output should be " + waterOutput);
		
    }

}
