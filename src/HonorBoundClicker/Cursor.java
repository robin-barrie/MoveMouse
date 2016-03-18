package HonorBoundClicker;

import java.awt.MouseInfo;

public class Cursor {
	
    
    public void get() throws InterruptedException{
        while(true){
          //Thread.sleep(100);
          System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                  ", " + 
                  MouseInfo.getPointerInfo().getLocation().y + ")");
        }
      }

}
