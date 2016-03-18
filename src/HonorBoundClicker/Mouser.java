package HonorBoundClicker;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Mouser {
	

    public void move (int x, int y) throws Exception {
    // SET THE MOUSE X Y POSITION
      
    	try {
    		Robot robot = new Robot();
        
    		robot.mouseMove(x, y);
         
    		System.out.println("mouse moved to");
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
    
    }
    
    public void move (int x, int y, int time) throws Exception {
    // SET THE MOUSE X Y POSITION
      
    	try {
    		Robot robot = new Robot();
        
    		robot.mouseMove(x, y);
    		TimeUnit.SECONDS.sleep(time);
         
    		System.out.println("mouse moved to");
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
    
    }
    
    
    public void click() throws Exception {
    	
    	try {
        Robot robot = new Robot();

        
        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(200);

        /*
        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(-100);
        */
    	
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                ", " + 
                MouseInfo.getPointerInfo().getLocation().y + ")");
        
    	//System.out.println("mouse left clicked");
        
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}

    }
    
   public void click(int time)throws Exception {
    	
    	try {
        Robot robot = new Robot();

        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    	TimeUnit.SECONDS.sleep(time);

        /*
        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(-100);
        */
        
    	
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                ", " + 
                MouseInfo.getPointerInfo().getLocation().y + ")");
        
    	
        //System.out.println("mouse right clicked");
    	
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
		
    }
    

}
