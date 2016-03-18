package Maps;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import HonorBoundClicker.HB;

public class GuildAssault {
	
	  
    public void finalAssault() throws Exception {
        // move mouse, press and hold mouse button, move mouse, and release button
          
        	try {
        		//Robot robot = new Robot();
            
        		//getCursor();
        		  TimeUnit.SECONDS.sleep(3);

        		  HB.mouser.move(620, 585);  //Enter
        		  HB.mouser.click();
              	     TimeUnit.SECONDS.sleep(1);

              	   HB.mouser.move(603, 607);	//ok
              	   HB.mouser.click();
              		
              		TimeUnit.SECONDS.sleep(10);
              		
              		HB.mouser.move(836, 445);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(10);
              		HB.mouser.move(961, 703);  //autoAttack
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(31);

              		HB.mouser.move(836, 445);  //NE treasure
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(5);              		
              		
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);

              		HB.mouser.move(836, 445);  //Portal
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(6);

              	       		
              		HB.mouser.move(923,  694);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(6);

              		HB.mouser.move(247, 389);  // Assault
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(2);
              		       		  
        		  
        		  
        		
        	} catch (AWTException ex) {
        		System.err.println(ex);
        	}   
     	
        }
    
    public void Yellow3of4() throws Exception {
        // move mouse, press and hold mouse button, move mouse, and release button
          
        	try {
        		Robot robot = new Robot();
            
        		//getCursor();
        		  TimeUnit.SECONDS.sleep(3);
     
            		robot.mouseMove(497, 607);  //Yellow Key 3 of 4
              		HB.mouser.click();
              	     TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(612, 615);	//ok
              		HB.mouser.click();
              		
              		TimeUnit.SECONDS.sleep(20);
              		
            		robot.mouseMove(402, 427);  //NW
            		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(20);
            		robot.mouseMove(961, 695);  //autoAttack
            		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(28);
              		
              		
              		robot.mouseMove(402, 427);  //NW
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(15);
            		robot.mouseMove(961, 695);  //autoAttack  
            		HB.mouser.click();
              		robot.mouseMove(841, 277);	//close pack if needed
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(25);

              		
              		robot.mouseMove(442, 631);  //SW
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(15);
            		robot.mouseMove(958, 695);  //autoAttack
            		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(28);
              		
              		robot.mouseMove(420, 439);  // (NW) chest, treasure, portal
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(2);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(5);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(3);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(3);
              		
              		
              		robot.mouseMove(919, 699);  //ok
              		HB.mouser.click();
    
               		TimeUnit.SECONDS.sleep(20);
        		  
        		  
        		  
        		
        	} catch (AWTException ex) {
        		System.err.println(ex);
        	}   
        	
        	
        	
        }
    
    public void YellowEnter4of4() throws Exception {
        // move mouse, press and hold mouse button, move mouse, and release button
          
        	try {
        		Robot robot = new Robot();
            
        		//getCursor();
        		  TimeUnit.SECONDS.sleep(3);
     
            		robot.mouseMove(464, 531);  //Yellow Key 4 of 4
            		HB.mouser.click();
              	     TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(608, 608);	//ok
              		HB.mouser.click();
              		
              		TimeUnit.SECONDS.sleep(15);
              		
              		
              		robot.mouseMove(840, 429);  //NE  intersection (always)
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(4);
              		
              		robot.mouseMove(840, 429);  //NE  - maybe to fight????
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(15);
            		robot.mouseMove(956, 700);  //autoAttack  
            		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(834, 285);  //close bag if not a fight (at intersection)
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(28);
              		
              		robot.mouseMove(840, 429);  //NE  intersection
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(4);
              		
            	           		
              		robot.mouseMove(828, 439);  //NE 
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(15);
            		robot.mouseMove(956, 700);  //autoAttack  
            		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(28);
              		
              		              		
              		robot.mouseMove(828, 439);  //NE Boss
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(15);
              		robot.mouseMove(956, 700);  //autoAttack  
              		HB.mouser.click();
               		TimeUnit.SECONDS.sleep(28);
               		
              		
              		robot.mouseMove(828, 439);  //NE treasure
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(5);
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
              		
              		robot.mouseMove(267, 559);  // Exit
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(480, 654);  // Exit
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(929, 696);  // OK
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(7);
              		robot.mouseMove(248, 387);  // Assault
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(2);
              		robot.mouseMove(784, 690);  // Begin
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(2);
              		
              		robot.mouseMove(835, 647);  // info/close path
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
              		robot.mouseMove(900, 315);  // close info if opened
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);              		
              		robot.mouseMove(275, 634);  // open Yellow path
              		HB.mouser.click();
              		TimeUnit.SECONDS.sleep(1);
    
               		TimeUnit.SECONDS.sleep(2);
        		  
        		  
        		  
        		
        	} catch (AWTException ex) {
        		System.err.println(ex);
        	}   
        	
        }
  

}
