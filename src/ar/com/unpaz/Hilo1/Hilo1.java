package ar.com.unpaz.Hilo1;

public class Hilo1 extends Thread{
	
   @Override
	public void run() {
	
	  for (int i = 0; i < 10; i++) {
		 
		  System.out.print(i+" G ");
		   
	       try {
			Hilo1.sleep(1000);
		} catch (InterruptedException e) {
		  e.printStackTrace();	
		}
	}
	
}
	
	

}
