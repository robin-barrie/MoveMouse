package Maps;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import HonorBoundClicker.HB;

public class COR {
	
	
	 
    public void MousemoveWithClickMAIN () throws Exception {
    // move mouse, press and hold mouse button, move mouse, and release button
      
    	try {
    		//Robot robot = new Robot();
    		
       
    		HB.mouser.move(843, 537);			//Goblin Trobe
    		HB.mouser.click();
    	  	TimeUnit.SECONDS.sleep(3);		//883	594
    	  	HB.mouser.move(540, 446);			//522 480
    	  	HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);
    		
    		HB.mouser.move(805, 419);			//All Hail King Ballow
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);		//842 455  		
    		HB.mouser.move(623, 292);			//629 305
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);
    		
    		HB.mouser.move(783, 495);			//Cataclysm
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);		// 816 535
    		HB.mouser.move(520, 332);			//500  350
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);

    		HB.mouser.move(919, 598);
      		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);		//960 670
    		HB.mouser.move(419, 576);			//370 636
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);
    		
    		
    				
    		HB.mouser.move(729, 614);			//COR
    		HB.mouser.click();					// 751 679
    		TimeUnit.SECONDS.sleep(3);		
    		HB.mouser.move(539, 330);
    		HB.mouser.click();
    		TimeUnit.SECONDS.sleep(3);
    		HB.mouser.move(607, 547);
    		HB.mouser.click();
       		TimeUnit.SECONDS.sleep(25);	
    		
    		
    		
    		/*
    		TimeUnit.MILLISECONDS.sleep(500);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            TimeUnit.MILLISECONDS.sleep(500);
            robot.mouseMove(790, 378);
            TimeUnit.MILLISECONDS.sleep(500);
            robot.mouseMove(700, 376);
            robot.mouserelease(InputEvent.BUTTON1_MASK);
            */
           
         
    		
    		
    		

    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}   
    }
    
    /**
    public void getCursor() throws InterruptedException{
        while(true){
          //Thread.sleep(100);
          System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                  ", " + 
                  MouseInfo.getPointerInfo().getLocation().y + ")");
        }
      }

    **/
    
    public void MousemoveWithClickTEMP () throws Exception {
        // move mouse, press and hold mouse button, move mouse, and release button
          
        	try {
        		//Robot robot = new Robot();
            
        		//cursor.get();
        		  TimeUnit.SECONDS.sleep(3);
        		/*
        		robot.mouseMove(966, 453);
        		Mouse.click();
        	     TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(242, 454);
        		Mouse.click();
        		TimeUnit.SECONDS.sleep(3);
        	*/
        		/*  
          		robot.mouseMove(858, 536);  //Mon afternoon
          		Mouse.click();
          	     TimeUnit.SECONDS.sleep(3);
          		robot.mouseMove(516, 332);
          		Mouse.click();
          		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(918, 597);
        		Mouse.click();
        	    TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(409, 572);
        		Mouse.click();
        		TimeUnit.SECONDS.sleep(3);
        		  */



        		HB.mouser.move(913, 416);  //Trial of the Gods w/ COR
        		HB.mouser.click();
              	TimeUnit.SECONDS.sleep(3);
              	HB.mouser.move(290, 407);
              	HB.mouser.click();
              	TimeUnit.SECONDS.sleep(3);
              	HB.mouser.move(901, 446);
              	HB.mouser.click();
            	TimeUnit.SECONDS.sleep(3);
            	HB.mouser.move(543, 331);
            	HB.mouser.click();
            	TimeUnit.SECONDS.sleep(3);
            	TimeUnit.SECONDS.sleep(3);
            	HB.mouser.move(601, 553);
            	HB.mouser.click();
               	TimeUnit.SECONDS.sleep(20);
        		  
        		  
        		  
        		  
        		  
          	/*
        		
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(729, 609);
        		Mouse.click();
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(539, 331);
        		Mouse.click();
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(601, 553);
        		Mouse.click();
           		TimeUnit.SECONDS.sleep(20);	
           		*/
        		
        	} catch (AWTException ex) {
        		System.err.println(ex);
        	}   
        	
        	
        	
        }
    
  
	
	 public void run() throws Exception {
		 
		
		   HB.move.NW();
		   HB.move.autoAttack();
		    
		   HB.move.NW();
		   HB.move.autoAttack();
		   
		   HB.move.NE();  //treasure
		   
		   HB.move.NE();
		   HB.move.autoAttack();
		    
		   HB.move.NE();
		   HB.move.autoAttack();
		     
		   HB.move.NE();  //intersection
		  
		   HB.move.NE();  //boss
		   	TimeUnit.SECONDS.sleep(10);
		   	HB.move.autoAttack();
		 
		   HB.move.NE();  //treasure 
		 
		   HB.move.NW();
		   HB.move.autoAttack();
		   	
		   HB.move.NW(); //   treasure
		   	
		   HB.move.NW();
		   HB.move.autoAttack();
		   	
		   HB.move.SW();
		   HB.move.autoAttack();
		   	
		   HB.move.SW();
		   HB.move.autoAttack();
		   	
		   HB.move.SW();  //treasure
		   	
		   HB.move.SW();
		   HB.move.autoAttack();
		   	
		   HB.move.NW();
		   HB.move.autoAttack();
		   	
		   HB.move.NW();  //treasure
		   
		   HB.move.SW();
		   HB.move.autoAttack();
		   	
		   HB.move.SW();  //intersection
		   
		   HB.move.SE();  //boss
		    TimeUnit.SECONDS.sleep(10);
		    HB.move.autoAttack();
		   	
		   HB.move.SE(); // treasure
		   	
		   HB.move.SE();
		   HB.move.autoAttack();	
		    
		   HB.move.SW();  //treasure
		    
		   HB.move.NW();
		   HB.move.autoAttack();
		    
		   HB.move.NW();  //treasure
		    
		   HB.move.NW();
		   HB.move.autoAttack();   	
		     
		   HB.move.NW();
		   HB.move.autoAttack();   	
		     
		   HB.move.NW();  //treasure
		    
		   HB.move.NW();
		   HB.move.autoAttack();   	
		     
		   HB.move.NE();
		   HB.move.autoAttack();
		    
		   HB.move.NE();  //BigBoss
		    TimeUnit.SECONDS.sleep(15);
		    HB.move.autoAttack();
		    
		    HB.move.NW();  //treasure
		       
		    HB.move.NW();  //portal
		   
		   //autoAttack();   //clicking NEXT

		   
		   
		    HB.move.end();    //clicking thru treasure
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		    HB.move.end();
		   
		   TimeUnit.SECONDS.sleep(14);
		   
		  }
		  
	 
}
