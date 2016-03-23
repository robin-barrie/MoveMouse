package HonorBoundClicker;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.networktables2.type.NumberArray;


public class NWTables {
	public NetworkTable gripTables;
	public  double xcenter, ycenter;
	public int x, y;
	public Process proc;
		

	
	
	public  void setup() {
		gripTables.setClientMode();
		gripTables.setIPAddress("192.168.1.100");	
		gripTables = NetworkTable.getTable("GRIP/myContoursReport");
		
		
		
		
		System.out.println("table setup");
		
	
		
		
		}
	
	public final void start(String pipeline) throws Exception{
		String fileLocation = "C:/Users/Robin/Documents/GitHub/MoveMouse/"+pipeline+".grip";
		String grip = "C:/Users/Robin/AppData/Local/GRIP/GRIP";
		//String command[] = {grip,"--headless", fileLocation};
		String command[] = {grip, fileLocation};
		System.out.println("opening GRIP");
		
		
		
		double[] defaultValue = new double[0];
		
		
		gripTables.putNumberArray("centerX", defaultValue);
		gripTables.putNumberArray("centerY", defaultValue);
		System.out.println("X Y zeroed");
		TimeUnit.SECONDS.sleep(5);
		
		
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

	
	public void stop() throws Exception {

		TimeUnit.SECONDS.sleep(10);
		this.proc.destroy();
		System.out.println("GRIP destroyed");

		
	}
	
	
	public void read() throws Exception {
		   
		double[] defaultValue = new double[0];
			
		   
		try {
			gripTables.putBoolean("run", true);
			System.out.println("GRIP stopped");
			TimeUnit.SECONDS.sleep(5);
			gripTables.putBoolean("run", true);
			System.out.println("GRIP started");
			TimeUnit.SECONDS.sleep(5);
	    	
	    	double[] centerx = gripTables.getNumberArray("centerX", defaultValue);
	    	double[] centery = gripTables.getNumberArray("centerY", defaultValue);
	    	System.out.println("centerX: " + centerx);
	   
	    	
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
