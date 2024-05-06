package ar.com.unpaz.hilo4;

public class Hilo4 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" K ");
			try {
		      Hilo4.sleep(4000);	
		      } catch (InterruptedException e) {
		       e.printStackTrace();
		   }
	  }
   }
 }

