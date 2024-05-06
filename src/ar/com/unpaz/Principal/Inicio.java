package ar.com.unpaz.Principal;

import ar.com.unpaz.Hilo1.Hilo1;
import ar.com.unpaz.Hilo2.Hilo2;
import ar.com.unpaz.Hilo3.Hilo3;
import ar.com.unpaz.hilo4.Hilo4;

public class Inicio {

	public static void main(String[] args) {
		Hilo1 hilo1 = new Hilo1();
		hilo1.start();
		
		Hilo2 hilo2 = new Hilo2();
		hilo2.start();
		hilo2.stop();
		 
		Hilo3 hilo3 = new Hilo3();
		hilo3.start();
		
		Hilo4 hilo4 = new Hilo4();
		hilo4.start();
		
			// TODO: handle exception
		}
}
		/*hilo1.start();
		try {
		hilo1.sleep(1000);	
		
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		
        Hilo2 hilo2 = new Hilo2();
        hilo2.start();
        try {
		hilo2.sleep(1000);
		//hilo2.stop();
	   } catch (InterruptedException e) {
		e.printStackTrace();
	    }
       
	}
}
}*/

