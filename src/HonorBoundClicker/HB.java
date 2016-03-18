package HonorBoundClicker;
 
import java.util.concurrent.TimeUnit;
/**
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.Dimension;
import java.awt.event.InputEvent;
 


import edu.wpi.first.wpilibj.networktables.NetworkTable;

import javax.imageio.ImageIO;

import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
**/


import Maps.COR;
import Maps.GuildAssault;


/**
 * 
 *
 */
public class HB {
	
	public static Mouser mouser;
	public static Cursor cursor;
	public static NWTables table;
	public static Move move;
	
	// ADD DUNGEONS HERE (1 of 2)..................
	public static COR cor;
	public static GuildAssault guildAssault;
	
	
    public static void main(String[] args)  throws Exception  {
    	
    	mouser = new Mouser();
    	cursor = new Cursor();
    	table = new NWTables();
    	move = new Move();
    	
    	// ADD DUNGEONS HERE (2 of 2)..............
    	cor = new COR();
    	guildAssault = new GuildAssault();
    	
    	
    	
    	// INIT ...................................
    	   TakePic.Full();
    		TimeUnit.SECONDS.sleep(5);
    	table.setup();
    	TimeUnit.SECONDS.sleep(5);
    	
    	// PROGRAM STARTS HERE.....................
    	
    	
    	TakePic.Full();
    	TimeUnit.SECONDS.sleep(5);
    	table.start("SEArrow");
    	TimeUnit.SECONDS.sleep(5);
    	table.read();
    	TimeUnit.SECONDS.sleep(5);
    	mouser.move((int)table.xcenter, (int)table.ycenter);
    	table.stop();
    	TimeUnit.SECONDS.sleep(5);
    	TakePic.Full();
    	TimeUnit.SECONDS.sleep(5);
    	table.start("AutoAttack");
    	TimeUnit.SECONDS.sleep(5);
    	table.read();
    	table.stop();
    	TimeUnit.SECONDS.sleep(50);
    	
    	
    	//TimeUnit.SECONDS.sleep(50);
    	//TakePic.Full();
    	//TakePic.Partial();
      
    	//cursor.get();
       	  
    	// Mouse.move (100,470);   //850 200
    	
    	TimeUnit.SECONDS.sleep(5);
    	table.start("SEArrow");
    	TimeUnit.SECONDS.sleep(15);
    	table.stop();
    
    	TimeUnit.SECONDS.sleep(50);
    		while(true) {
    	    	
    	
    		 	//TakePic.Full();
    	    	
    		 	
    	    	TimeUnit.SECONDS.sleep(5);
    	    	//table.read();
    	    	TimeUnit.SECONDS.sleep(5);
    	    	//mouser.move((int)table.xcenter, (int)table.ycenter);
    	    	TimeUnit.SECONDS.sleep(5);
    			
    			// MousemoveWithClickMAIN();
    			//MousemoveWithClickTEMP();
    	
    			//	YellowEnter3of4();
    			// YellowEnter4of4();
    		
    			//HB.guildAssault.finalAssault();
    			//HB.cor.run();
    		}
    } 	
    

	///  noyt....... Display.getCurrent().getCursorLocation();
    //
    //NOT TESTED  
    //
    //http://www.codejava.net/java-se/graphics/how-to-capture-screenshot-programmatically-in-java
    //
  

 
   
    
}