package ar.com.unpaz.Hilo3;

public class Hilo3 extends Thread {
	
	
	@Override
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" E ");
			try {
				Hilo3.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
