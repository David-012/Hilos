package ar.com.unpaz.Hilo2;

public class Hilo2 extends Thread {
	
	@Override
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			 
			System.out.print(i+" E ");
			try {
				Hilo2.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}
