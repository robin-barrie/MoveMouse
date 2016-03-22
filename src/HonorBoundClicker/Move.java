package HonorBoundClicker;

import java.util.concurrent.TimeUnit;

public class Move {
	
	 int west = 420;		//445	434
	public  int north = 439; 	//400	438
	public  int east = 883;		//800 	800
	 int south = 614;		//565 	612
	 int aax = 958;		//891	965
	 int aay = 695;		//627	700
	 int nextx = 887;		//965
	 int nexty = 689;		//700
	 int endx = 923;		//965
	 int endy = 700;		//700
	
	

	 
    public void MoveClick(int x, int y) throws Exception {
    
    	HB.mouser.move(x, y);
    	HB.mouser.click();
    	TimeUnit.SECONDS.sleep(7);   
    }
    
    public void NW() throws Exception {
        
    	HB.mouser.move(west, north);
    	HB.mouser.click();
    	TimeUnit.SECONDS.sleep(7);   
    }

    public void NE() throws Exception {
    	
    	HB.mouser.move(east, west);
    	HB.mouser.click();
    	TimeUnit.SECONDS.sleep(7);
    }
    
    public void SW() throws Exception {
    	HB.mouser.move(west, north);
    	HB.mouser.click();

  	  TimeUnit.SECONDS.sleep(7);
  	  
    }
    
    public void SE() throws Exception {	
    	HB.mouser.move(east, south);
    	HB.mouser.click();
  	  TimeUnit.SECONDS.sleep(7);  
    }
    
    public  void autoAttack() throws Exception {
    	
    	TimeUnit.SECONDS.sleep(2);	
    	HB.mouser.move(aax, aay);
    	HB.mouser.click();
  	   	TimeUnit.SECONDS.sleep(25);
  }
    
    public  void next() throws Exception {
    	
    	TimeUnit.SECONDS.sleep(1);
    	HB.mouser.move(nextx, nexty);
    	HB.mouser.click();
  }
    
    public  void end() throws Exception {
    	
    	TimeUnit.MILLISECONDS.sleep(200);
    	HB.mouser.move (endx, endy);
    	HB.mouser.click();
  }
  

}
