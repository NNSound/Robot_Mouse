package test;


import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FirstCard{
	static ArrayList mouse_XY = new ArrayList();//�ŧi�ʺA�}�C��minput , �٤��ӷ|��
	static ArrayList mouse_time = new ArrayList();//�ŧi�ʺA�}�C��minput , �٤��ӷ|��	
	Robot robot = new Robot();
	
	public static void main(String[] args) throws AWTException {	
		
		// TODO �۰ʲ��ͪ���k Stub
		/*��ƹ������ɭ� �����y�� �ðO���ɶ�
		 * �ڦ��ߤF �}JFrame�a
		 * ���K�ήɰ����y��
		 */
		//addMouseListener()
		new FirstCard();		
	}
	public FirstCard() throws AWTException{
		
		
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point point = pi.getLocation();
		System.out.println("x:" + point.x + " | y: "  + point.y);
		}
	
	
	public void mousePressed(MouseEvent e) {
        //text.setText("x: " + e.getX() + ", y: " + e.getY());
        System.out.print("screen x: " + e.getXOnScreen());
        System.out.print(", y: " + e.getYOnScreen() + "\n");
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("left button");
        }
        if (e.getButton() == MouseEvent.BUTTON2) {
            System.out.println("middle button");
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("right button");
        }
        System.out.println("mouse position: " + e.getPoint());
        System.out.println("mouse screen position: " + e.getLocationOnScreen());
        System.out.println("mouse clicks: " + e.getClickCount());
    }
}

	
	
	
    
	


