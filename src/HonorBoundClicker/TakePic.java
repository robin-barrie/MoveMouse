package HonorBoundClicker;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TakePic {
	
    public static void Full () {
  	  try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "FullScreenshot." + format;
             
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
             
            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
  }
  public static void Partial() {
      try {
          Robot robot = new Robot();
          String format = "jpg";
          String fileName = "PartialScreenshot." + format;
           
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
          Rectangle captureRect = new Rectangle(0, 0, screenSize.width / 2, screenSize.height / 2);
          BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
          ImageIO.write(screenFullImage, format, new File(fileName));
           
          System.out.println("A partial screenshot saved!");
      } catch (AWTException | IOException ex) {
          System.err.println(ex);
      }
  }

  void captureComponent(Component component) {                Rectangle rect = component.getBounds();
  
  try {
      String format = "png";
      String fileName = component.getName() + "." + format;
      BufferedImage captureImage =
              new BufferedImage(rect.width, rect.height,
                                  BufferedImage.TYPE_INT_ARGB);
      component.paint(captureImage.getGraphics());

      ImageIO.write(captureImage, format, new File(fileName));

      System.out.printf("The screenshot of %s was saved!", component.getName());
  	} catch (IOException ex) {
      System.err.println(ex);
  }
}
  
}
