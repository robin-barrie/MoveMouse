package HonorBoundClicker;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.networktables.NetworkTable;


public class NWTables {
	public  NetworkTable gripTables;
	public  double xcenter, ycenter;
	public int x, y;
	public Process proc;
	
	public  void setup() {
		gripTables.setClientMode();
		gripTables.setIPAddress("192.168.1.100");	
		gripTables = NetworkTable.getTable("GRIP/myContoursReport");
		}
	
	public final void start(String pipeline) throws Exception{
		String fileLocation = "C:/Users/Robin/Documents/GitHub/MoveMouse/"+pipeline+".grip";
		String grip = "C:/Users/Robin/AppData/Local/GRIP/GRIP";
		String command[] = {grip, fileLocation};
		//double[] defaultValue = new double[0];
		
		final ProcessBuilder processBuilder = new ProcessBuilder(command);
		
		 proc = processBuilder.inheritIO().start();
		 //TimeUnit.SECONDS.sleep(15);
		// proc.destroy();
        
		//try {
        	//ProcessBuilder.directory("\\Users\\Robin\\AppData\\Local\\GRIP");  
        	//ProcessBuilder.this.directory("\Users");    
            //new ProcessBuilder("C:/Users/Robin/AppData/Local/GRIP/GRIP","C:/Users/Robin/Documents/GitHub/MoveMouse/test.grip").inheritIO().start();
        	//new ProcessBuilder("C:/Users/Robin/AppData/Local/GRIP/GRIP","--headless",fileLocation).inheritIO().start();
        	//proc[1] = new ProcessBuilder(grip,fileLocation).inheritIO().start();
        	//
       // } catch (IOException e) {
        //    e.printStackTrace();
         // 
       // }
        
        
     /**
        TimeUnit.SECONDS.sleep(5);
        
		try {
	    	
	    	double[] centerx = gripTables.getNumberArray("centerX", defaultValue);
	    	double[] centery = gripTables.getNumberArray("centerY", defaultValue);
	    	System.out.println("centerX: ");
			for (double centerX : centerx) {
				 xcenter = centerX;
			}
			for (double centerY : centery) {
				ycenter = centerY;
			}
			// center = centerx[0];
			//double center1 = centerx[1];
			System.out.println(xcenter +" "+ ycenter);
			
		} catch (NullPointerException ex) {
   		System.err.println(ex);
			}
		int x = (int) xcenter;
		int y = (int) ycenter;
        
		TimeUnit.SECONDS.sleep(5);
		proc[1].destroyForcibly();
        
		HB.mouser.move(x, y);
    	TimeUnit.SECONDS.sleep(5);
    	
    	**/
	}

	
	public void stop(){

		this.proc.destroy();

		
	}
	
	
	public void read() throws Exception {
		   
		double[] defaultValue = new double[0];
		
		   
		try {
	    	
	    	double[] centerx = gripTables.getNumberArray("centerX", defaultValue);
	    	double[] centery = gripTables.getNumberArray("centerY", defaultValue);
	    	System.out.println("centerX: ");
			for (double centerX : centerx) {
				 xcenter = centerX;
			}
			for (double centerY : centery) {
				ycenter = centerY;
			}
			// center = centerx[0];
			//double center1 = centerx[1];
			System.out.println(xcenter +" "+ ycenter);
			
		} catch (NullPointerException ex) {
   		System.err.println(ex);
			}
		x = (int) xcenter;
		y = (int) ycenter;
	    	
	}
	
	/**
	 * NetworkTable table = NetworkTable.getTable("GRIP");

table.putBoolean("run", false); // Stop GRIP without killing the process

doSomeStuffThatDoesntNeedVision();

table.putBoolean("run", true); // Start GRIP again
	 **/
	
	
}
