package test;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class testing {
	Robot robot=new Robot();
	static long time1,time2;
	public static void main(String[] args) throws AWTException, IOException {
		// TODO 自動產生的方法 Stub
		new testing();
	}
	public testing() throws AWTException, IOException{
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);
		BufferedImage picture = robot.createScreenCapture(screenRect);
		ImageIO.write(picture, "jpg", new File("Screenshot_Temp"+1+".jpg")); 
		Color A;
		A=robot.getPixelColor(1000, 400);//117,50,0
		time1 = System.currentTimeMillis();
		for(int i=0;i<20;i++){
			for(int j=0;j<80;j++){
				A=robot.getPixelColor(800+i, 350+j);
				if(100<A.getRed()&&A.getRed()<137){
					System.out.println("getit	"+i+"	"+j);
					robot.mouseMove(800+i, 350+j);
				}				
			}
		}
		time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		*/
		 FileWriter fw = new FileWriter("RuningTime.txt",true);
		 for(int i=0;i<10;i++){
			 fw.append("test"+2+"\r\n");		         
		        // fw.append("test"+"\r\n");
			 
			 fw.flush();
			 //System.exit(0);
		 }		
		 
		 //fw.close();     
		
		
		

		
	}

}
