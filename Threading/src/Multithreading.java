
public class Multithreading {

	public static void main(String[] args) {
		//using Thread class
		Worker w1 = new Worker();
		w1.start();
	}	
	class Worker extends Thread{
			
			@Override
			public void run() {
				System.out.println("Running thread...");
			
		}

	}

}
