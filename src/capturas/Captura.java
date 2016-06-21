package capturas;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Captura {

	/**
	 * @param args
	 */
	public static void init() {
		try
		{
			System.out.println("[ Captura iniciada ]");
			//sleep 5 sg
//			Thread.currentThread().sleep(5*1000);
//			String FILENAME="/home/jose/Desktop/captura01.png";
			String FILENAME="captura01.png";
			Captura.captureScreen(FILENAME);
			System.out.println("[ Captura finalizada ]");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void captureScreen(String fileName) throws Exception {
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "png", new File(fileName));
	}

}
