package test;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JavaRobot
{
  Robot robot = new Robot();
  static long time1,time2,total,num=0;//�]�m�t�ήɶ� �H�[���ɶ��Ĳv
  FileWriter fw = new FileWriter("RuningTime.txt",true);

  public static void main(String[] args) throws AWTException, IOException
  {
    new JavaRobot();
  }  
  public JavaRobot() throws AWTException, IOException
  {	
    robot.setAutoDelay(40);
    robot.setAutoWaitForIdle(true);   
    robot.delay(3000);
    //LINK();
    
    while(num<1){
    time1 = System.currentTimeMillis();//�}�l�ɶ�//�������j���
    
    NEWGAME();
    /*
	//�i�J�Ʒ��s�t--------------------------
	robot.mouseMove(530,65);//btn �e���U�s�t
	leftClick();
	robot.delay(500);
	robot.mouseMove(760,320);//btn �Ƴ��s�t
	leftClick();
	robot.delay(3000);
	*/
	//�Ʒ�END--------------------------------------
	
	Lucky();
	Lucky();
	Lucky();
	//�ݸ}��-----------------------------------------
	robot.mouseMove(1200,70);//���a��btn
	leftClick();
	robot.delay(3000);
	robot.mouseMove(835,420);//OKMENU btn �i��|�����ȵo�� �i��S��
	leftClick();
	robot.delay(500);
	robot.mouseMove(835,565);//MENU btn ,���}���
	leftClick();
	robot.delay(500);
	robot.mouseMove(560,535);//������btn
	leftClick();
	robot.delay(1000);
	robot.mouseMove(560,400);//���s��btn
	leftClick();
	robot.delay(2000);
	robot.mouseMove(1225,400);//���w�Ƹ}��btn
	leftClick();	  
	robot.delay(1000);
	//�ݸ}��END---------------------------------------
    picture();
    //�i�h�]�w--------------------------------------
    robot.mouseMove(1225,585);//���a�� btn
	leftClick();
	robot.delay(3000);
	robot.mouseMove(835,565);//MENU btn ,���}���
	leftClick();
	robot.delay(500);
	robot.mouseMove(1210,525);//��� btn ,���}���
	leftClick();
	robot.delay(3000);
	//----------------------------------------------
    slied(575,550);
    password();
    picture();
	replayGAME();
	robot.delay(1000);
	time2 = System.currentTimeMillis();//�����ɶ�
	total=(((time2-time1)/1000)/60);
	System.out.println(total+"min");//�L�X�Ҫ�O���ɶ�
	fw.append(total+"min"+"\r\n");	
	fw.flush();
	num++;
    }  
    
	fw.close();
    System.exit(0);
  }
  void NEWGAME(){
	  	robot.mouseMove(830, 590);//home btn
		leftClick();
		robot.delay(700);
		robot.mouseMove(1100, 100);//app btn
		leftClick();
		robot.delay(18000);//���ݶi�J�C���e��
		
		click_N(10,950,500);
		
		leftClick();//�I�εn�J�e��	
		robot.mouseMove(950, 500);//�P�N����btn
		leftClick();	
		
		System.out.println("���}�Y�ʵe");
		robot.delay(60000);//���}�Y�ʵe
		robot.delay(25000);	//25S ���ɤ���
		
		click_N(25);
		skip();
		click_N(16);//���P�Q�d�o��
		fast();
		
		robot.mouseMove(900, 300);//�I�θ}��	
		leftClick();
		robot.delay(500);
		robot.mouseMove(900,450);//���ʸ}���U��	
		leftClick();
		robot.delay(8000);
		
		click_N(18);//���P�Q�d�o��      
		robot.mouseMove(900,200);//�}�Ⲿ�ʨ�W��
		leftClick();
		robot.delay(5000);
		click_N(24,1000,600);//�԰�����
		
		skip();
		robot.delay(12000);
		//-------------------------------------------------
		click_N(20,1000,600);//���P�Q�d�o��	
		System.out.println("�}����");		
		//robot.mouseMove(1000,600);//�ϥΥ�����
		//leftClick();
		click_N(25);//�԰�����
		robot.delay(1000);
		skip();
		
		System.out.println("��o�ͮ� ��OK");	
		robot.mouseMove(1200,470);//��o�ͮ� ��OK
		leftClick();
		robot.delay(1000);
		
		skip();
		click_N(16);
		robot.mouseMove(835,250);//�e���ƥ�1
		leftClick();
		robot.delay(8000);
		fast();//�n��
		robot.delay(8000);
		
		click_N(16,1010,350); //�԰�����		
		System.out.println("����!!�i�J�Ƴ�by Ckick_N");
		robot.mouseMove(1010,350);//�i�J�Ƴ��]���n�� �ոլ�
		leftClick();
		robot.delay(2000);
		
		click_N(25);//�j���o��
		System.out.println("�j���o��");
		robot.mouseMove(1000,250);//main_story 1-1 
		leftClick();
		robot.delay(8000);
		skip();
		//robot.mouseMove(835,450);
		robot.delay(6000);//���J�԰�
		fast();
		robot.delay(25000);//�԰�ING
		click_N(20);//�԰�����+�P�Q�d�O�e
		robot.mouseMove(1000,250);//main_story 1-1.2
		leftClick();
		robot.delay(5000);
		skip();
		robot.delay(5000);//���J�԰�
		fast();
		robot.delay(30000);//2Wave
		click_N(22);//�԰�����
		robot.mouseMove(835,450);//�ɯŽT�{ 1-1.2
		leftClick();
		robot.delay(10000);
		skip();//�S���� �U���ˬd
		
		click_N(20,500,350);
		System.out.println("����!!!�i�J�s�tby Click_N");
		//�H�U�}�l�i�J�s�t
		robot.mouseMove(500,350);//�s�t���s
		leftClick();
		robot.delay(2000);
		
		click_N(22);//�n��
		
		robot.mouseMove(800,380);//btn ��i�@�_�� �y�п��F
		leftClick();
		robot.delay(2000);
		robot.mouseMove(835,385);//btn ����J
		leftClick();
		robot.delay(1000);	
		click_N(8);
		skip();
		click_N(5);
		skip();
		robot.mouseMove(1200,470);//���Ⱖ��ok
		leftClick();
		robot.delay(1000);
		click_N(50);//�e�R+�j���o��
		//��main_story1-2.1
		robot.mouseMove(1000,250);
		leftClick();
		robot.delay(10000);
		skip();
		click_N(24);//���U�H�o��
		fast();
		robot.delay(8000);
		click_N(12);//���o���o��
		robot.mouseMove(1235,300);//�I�Τ}��
		leftClick();
		robot.mouseMove(1235,200);//���ʨ�W��
		leftClick();
		robot.delay(8000);
		click_N(10);//���j�B�o��
		System.out.println("Line 161");
		robot.delay(5000);
		click_N(28);//�԰�����
		skip();//���L���˶ħL�ʵe
		robot.mouseMove(1200,470);//��o�J�p�� ��OK
		leftClick();
		robot.delay(3000);
		click_N(16);//���U�H�o��
		//�s�趤��
		robot.mouseMove(560,535);//������btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(560,400);//���s��btn
		leftClick();
		robot.delay(2000);
		click_N(26);//���U�H�o�� �o��|��U�����L ��L1�� �n�ո�
	/**
		robot.mouseMove(915,335);//�����1���
		leftClick();
		robot.delay(3000);
		robot.mouseMove(915,335);//��ܧJ�p��
		leftClick();
		robot.delay(3000);
		click_N(12);//���U�H�o��
		robot.delay(3000);
		robot.mouseMove(1000,250);//��main1-2.2
		leftClick();
		robot.delay(8000);	
	*/    
		skip();	
		robot.delay(18000);
		click_N(10);//���U�H�o��
		fast();
		robot.delay(35000);//��3wave�԰�
		click_N(18);//�԰�����
		skip();//���L�ʵe(�U�H�y)
		robot.delay(10000);
		click_N(20);//�j�����
		//2565,70 �a��btn
		robot.mouseMove(1200,70);//���a��btn
		leftClick();
		robot.delay(3000);
		System.out.println("Line 199");
		//2090,295
		robot.mouseMove(725,295);//�����W�p��btn �����U��1��
		leftClick();
		robot.delay(5000);
		click_N(10);//�P�Q�d�o��+���
		//2505,570
		robot.mouseMove(1140,570);//���ȶ}�lbtn
		leftClick();
		robot.delay(18000);//���J�԰�
		fast();
		robot.delay(30000);//2wave �԰�
		click_N(18);//�԰�����	
		robot.delay(4000);
		robot.mouseMove(625,520);//�����n�͡A���_
		leftClick();
		robot.delay(5000);
		click_N(10);//�U���]���F
		
		robot.mouseMove(765,270);//�����W�p��btn �����U��2��
		leftClick();
		robot.delay(4000);
		click_N(6);
		robot.mouseMove(1140,570);//���ȶ}�lbtn �@3wave
		leftClick();
		robot.delay(15000);//���ݸ��J�԰�
		//�o��ݭn���ʾԤh 2275 200 && 2275 450 ���e��1800
		fast();
		robot.mouseMove(910,200);//�I�ͮ�
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,200);//�I�p�L
		leftClick();
		robot.mouseMove(910,450);//�I�n��
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,450);//�I�p�L
		leftClick();
		robot.delay(37000);//��3wave �i��n�� �]�����[�t�F
		click_N(18);//�԰�����
		robot.mouseMove(625,520);//�����n�͡A���_
		leftClick();
		robot.delay(3000);
		click_N(20);//�԰�����
		robot.mouseMove(1200,470);//��o�ͮ� ��OK
		leftClick();
		click_N(14);//���P�Q�d�o��
		System.out.println("Line 247");
	    //1925 540
		robot.mouseMove(560,500);//���t�Fbtn
		leftClick();
		robot.mouseMove(660,400);//���s��btn
		leftClick();
		click_N(10);//���e�R�v�o��
		//�X���� (500,300)
		robot.mouseMove(500,300);//�����
		leftClick();
		robot.delay(2000);
		robot.mouseMove(600,300);//�d�����
		leftClick();
		robot.delay(2000);
		click_N(8);//�s�I�|�� ���e�R�v�o�� �s�I���L�U��
	/**
		robot.mouseMove(900,250);//���������
		leftClick();
		robot.delay(2000);
		leftClick();//��ܳͮ�
	*/
		robot.delay(2000);
		robot.mouseMove(1235,350);//���OK
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1000,590);//�X��btn
		leftClick();
		robot.delay(5000);//test
		robot.mouseMove(835,400);//�Obtn
		leftClick();
		robot.delay(2000);
		click_N(30);
		System.out.println("�X�����q����");
		//�X�����q����
		robot.mouseMove(835,380);//OK btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(1200,70);//home btn
		leftClick();
		robot.delay(3000);
		robot.mouseMove(835,400);//OK btn ,�A�w�����s��о�
		leftClick();
		robot.delay(3000);
		click_N(10);
		robot.mouseMove(1245,600);//�k�U��§�� btn 
		leftClick();
		robot.delay(4000);
		robot.mouseMove(770,100);//���d�����~���btn
		leftClick();
		robot.delay(4000);
		robot.mouseMove(835,415);//OK btn 
		leftClick();
		robot.delay(3000);
		robot.mouseMove(1225,85);//��^  btn 
		leftClick();
		robot.delay(5000);
		robot.mouseMove(835,415);//OK btn ,�H�W�s��оǵ���
		leftClick();
		robot.delay(10000);
		System.out.println("Line 303");
		robot.mouseMove(1330,65);//�k�W�� X btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.mouseMove(840,435);//�p�G����͸t�F������
		leftClick();
		robot.delay(1000);
		robot.mouseMove(835,550);//OK btn ,�s�⪱�aBONUS
		leftClick();
		robot.delay(3000);
		robot.mouseMove(715,450);//�{�b���n btn ,�U���l�[�ɮ�
		leftClick();
		robot.delay(8000);
		robot.mouseMove(835,565);//MENU btn ,���}���
		leftClick();
		robot.delay(500);
		robot.mouseMove(885,525);//��J btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.delay(2000);
  }
  private void skip()
  {
	  robot.mouseMove(1220,75);
	  leftClick();
	   robot.delay(5000);//�쥻��10��
  }
  private void fast()
  {
	  robot.mouseMove(1235,75);
	  leftClick();
  }
  private void click_N(int n)
  {
	  System.out.print(n);
	  robot.mouseMove(850,300);
	  for(int i=0;i<n;i++){
		  leftClick();
		  robot.delay(500);
	  }
	  System.out.println("end");
  }
  private void click_N(int n,int x,int y)
  {
	  System.out.print(n);
	  robot.mouseMove(x,y);
	  for(int i=0;i<n;i++){
		  leftClick();
		  robot.delay(500);
	  }
	  System.out.println("end");
  }
  private void Lucky()
  {
	  //1915,515
	  robot.mouseMove(550,515);//btn ��@��
	  leftClick();
	  robot.delay(1000);
	  robot.mouseMove(935,400);//
	  leftClick();
	  robot.delay(2000);
	  click_N(8);
	  skip();
	  robot.mouseMove(835,415);//OK btn �٦�[�J���s����
	  leftClick();
	  robot.delay(500);
	  robot.mouseMove(835,425);//OK btn �٦�[�J���s����
	  leftClick();
	  robot.delay(1500);
	  robot.mouseMove(1200,470);//��o�}�� ��OK
	  leftClick();
	  robot.delay(5000);
  }
  //1640,240
  private void picture(String name) throws IOException{
	  //�٦����OK�n��
	  Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);
		BufferedImage picture = robot.createScreenCapture(screenRect);
		ImageIO.write(picture, "jpg", new File(name+num+".jpg"));
		
  }
  private void picture() {
	  //�٦����OK�n��
	 
	  robot.mouseMove(275,240);//�I�� btn 
	  leftClick();
	  robot.delay(6000);
	  
	  robot.mouseMove(1000,515);//�I�� btn 
	  leftClick();
	  robot.delay(6000);
	  
	  
	  robot.mouseMove(760,450);//�x�s btn 
	  leftClick();
	  robot.delay(6000);
	  	  
  }
  private void slied(int x,int y)
  {
	  robot.mouseMove(x,y);//�_�l��m
	  robot.mousePress(InputEvent.BUTTON1_MASK);
	  for(int i=0;i<y-50;i=i+10){
		  robot.mouseMove(x,y-i);
		  robot.delay(100);
	  }
	  robot.mouseRelease(InputEvent.BUTTON1_MASK);  
	  /**
		//�즲------------------------------------------
		robot.mouseMove(850,400);//��J btn 
		robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
		for(int i=0;i<300;i=i+5){
			robot.mouseMove(850,400-i);//��J btn 	    
		}
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    //�즲����--------------------------------------
		*/
  }
  private void password(){
	    robot.mouseMove(585,510);//btn�]�w�ಾ��
		leftClick();
		robot.delay(500);
		//2300,240
		robot.mouseMove(975,240);//�]�w�ಾ���K�X
		leftClick();
		robot.delay(1000);
		for(int i=0;i<8;i++)
			type(KeyEvent.VK_NUMPAD0);
		//type("00000000");
		robot.mouseMove(975,240);//btn�]�w�ಾ�K�� �ĤG����J
		leftClick();
		robot.delay(500);
		robot.mouseMove(975,330);//btn�]�w�ಾ�K�� �ĤG����J
		leftClick();
		robot.delay(1000);
		for(int i=0;i<8;i++)
			type(KeyEvent.VK_NUMPAD0);

		robot.mouseMove(975,480);//�׮���@�L
		leftClick();
		robot.delay(500);
		robot.mouseMove(975,480);//btn�]�w
		leftClick();
		robot.delay(500);
		//�T�{������ �A��]�w�R����� �N�n�F
		robot.mouseMove(835,480);//btn�]�w
		leftClick();
		robot.delay(500);
  }
  private void replayGAME(){
	//2125,15
	    robot.mouseMove(760,15);//btn ����APP
		leftClick();
		robot.delay(3000);
		robot.mouseMove(555,15);//btn�]�w
		leftClick();
		robot.delay(2000);
		robot.mouseMove(435,180);//btn���Ϋ���
		leftClick();
		robot.delay(2000);
		robot.mouseMove(535,260);//btn CC APP
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1065,415);//btn �M�����
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1010,400);//btn �T�w
		leftClick();
		robot.delay(1000);
		robot.mouseMove(420,15);//btn Andrid
		leftClick();
		robot.delay(2000);
  }
  private void leftClick()
  {
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(200);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(200);
  }
  
  private void type(int i)
  {
    robot.delay(40);
    robot.keyPress(i);
    robot.keyRelease(i);
  }

  private void type(String s)
  {
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      robot.delay(40);
      robot.keyPress(code);
      robot.keyRelease(code);
    }
  }
  private void LINK() throws IOException{	  
	  skip();
		robot.delay(12000);
		//-------------------------------------------------
		click_N(20,1000,600);//���P�Q�d�o��	
		System.out.println("�}����");		
		//robot.mouseMove(1000,600);//�ϥΥ�����
		//leftClick();
		click_N(25);//�԰�����
		robot.delay(1000);
		skip();
		
		System.out.println("��o�ͮ� ��OK");	
		robot.mouseMove(1200,470);//��o�ͮ� ��OK
		leftClick();
		robot.delay(1000);
		
		skip();
		click_N(16);
		robot.mouseMove(835,250);//�e���ƥ�1
		leftClick();
		robot.delay(8000);
		fast();//�n��
		robot.delay(8000);
		
		click_N(16,1010,350); //�԰�����		
		System.out.println("����!!�i�J�Ƴ�by Ckick_N");
		robot.mouseMove(1010,350);//�i�J�Ƴ��]���n�� �ոլ�
		leftClick();
		robot.delay(2000);
		
		click_N(20);//�j���o��
		System.out.println("�j���o��");
		robot.mouseMove(1000,250);//main_story 1-1 
		leftClick();
		robot.delay(8000);
		skip();
		//robot.mouseMove(835,450);
		robot.delay(6000);//���J�԰�
		fast();
		robot.delay(25000);//�԰�ING
		click_N(20);//�԰�����+�P�Q�d�O�e
		robot.mouseMove(1000,250);//main_story 1-1.2
		leftClick();
		robot.delay(5000);
		skip();
		robot.delay(5000);//���J�԰�
		fast();
		robot.delay(30000);//2Wave
		click_N(22);//�԰�����
		robot.mouseMove(835,450);//�ɯŽT�{ 1-1.2
		leftClick();
		robot.delay(10000);
		skip();//�S���� �U���ˬd
		
		click_N(20,500,350);
		System.out.println("����!!!�i�J�s�tby Click_N");
		//�H�U�}�l�i�J�s�t
		robot.mouseMove(500,350);//�s�t���s
		leftClick();
		robot.delay(2000);
		
		click_N(22);//�n��
		
		robot.mouseMove(800,380);//btn ��i�@�_�� �y�п��F
		leftClick();
		robot.delay(2000);
		robot.mouseMove(835,385);//btn ����J
		leftClick();
		robot.delay(1000);	
		click_N(8);
		skip();
		click_N(5);
		skip();
		robot.mouseMove(1200,470);//���Ⱖ��ok
		leftClick();
		robot.delay(1000);
		click_N(50);//�e�R+�j���o��
		//��main_story1-2.1
		robot.mouseMove(1000,250);
		leftClick();
		robot.delay(10000);
		skip();
		click_N(24);//���U�H�o��
		fast();
		robot.delay(8000);
		click_N(12);//���o���o��
		robot.mouseMove(1235,300);//�I�Τ}��
		leftClick();
		robot.mouseMove(1235,200);//���ʨ�W��
		leftClick();
		robot.delay(8000);
		click_N(10);//���j�B�o��
		System.out.println("Line 161");
		robot.delay(5000);
		click_N(28);//�԰�����
		skip();//���L���˶ħL�ʵe
		robot.mouseMove(1200,470);//��o�J�p�� ��OK
		leftClick();
		robot.delay(3000);
		click_N(16);//���U�H�o��
		//�s�趤��
		robot.mouseMove(560,535);//������btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(560,400);//���s��btn
		leftClick();
		robot.delay(2000);
		click_N(26);//���U�H�o�� �o��|��U�����L ��L1�� �n�ո�
	/**
		robot.mouseMove(915,335);//�����1���
		leftClick();
		robot.delay(3000);
		robot.mouseMove(915,335);//��ܧJ�p��
		leftClick();
		robot.delay(3000);
		click_N(12);//���U�H�o��
		robot.delay(3000);
		robot.mouseMove(1000,250);//��main1-2.2
		leftClick();
		robot.delay(8000);	
	*/    
		skip();	
		robot.delay(18000);
		click_N(10);//���U�H�o��
		fast();
		robot.delay(35000);//��3wave�԰�
		click_N(18);//�԰�����
		skip();//���L�ʵe(�U�H�y)
		robot.delay(10000);
		click_N(20);//�j�����
		//2565,70 �a��btn
		robot.mouseMove(1200,70);//���a��btn
		leftClick();
		robot.delay(3000);
		System.out.println("Line 199");
		//2090,295
		robot.mouseMove(725,295);//�����W�p��btn �����U��1��
		leftClick();
		robot.delay(5000);
		click_N(10);//�P�Q�d�o��+���
		//2505,570
		robot.mouseMove(1140,570);//���ȶ}�lbtn
		leftClick();
		robot.delay(18000);//���J�԰�
		fast();
		robot.delay(30000);//2wave �԰�
		click_N(18);//�԰�����	
		robot.delay(4000);
		robot.mouseMove(625,520);//�����n�͡A���_
		leftClick();
		robot.delay(5000);
		click_N(10);//�U���]���F
		
		robot.mouseMove(765,270);//�����W�p��btn �����U��2��
		leftClick();
		robot.delay(4000);
		click_N(6);
		robot.mouseMove(1140,570);//���ȶ}�lbtn �@3wave
		leftClick();
		robot.delay(15000);//���ݸ��J�԰�
		//�o��ݭn���ʾԤh 2275 200 && 2275 450 ���e��1800
		fast();
		robot.mouseMove(910,200);//�I�ͮ�
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,200);//�I�p�L
		leftClick();
		robot.mouseMove(910,450);//�I�n��
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,450);//�I�p�L
		leftClick();
		robot.delay(37000);//��3wave �i��n�� �]�����[�t�F
		click_N(18);//�԰�����
		robot.mouseMove(625,520);//�����n�͡A���_
		leftClick();
		robot.delay(3000);
		click_N(20);//�԰�����
		robot.mouseMove(1200,470);//��o�ͮ� ��OK
		leftClick();
		click_N(14);//���P�Q�d�o��
		System.out.println("Line 247");
	    //1925 540
		robot.mouseMove(560,500);//���t�Fbtn
		leftClick();
		robot.mouseMove(660,400);//���s��btn
		leftClick();
		click_N(10);//���e�R�v�o��
		//�X���� (500,300)
		robot.mouseMove(500,300);//�����
		leftClick();
		robot.delay(2000);
		robot.mouseMove(600,300);//�d�����
		leftClick();
		robot.delay(2000);
		click_N(8);//�s�I�|�� ���e�R�v�o�� �s�I���L�U��
	/**
		robot.mouseMove(900,250);//���������
		leftClick();
		robot.delay(2000);
		leftClick();//��ܳͮ�
	*/
		robot.delay(2000);
		robot.mouseMove(1235,350);//���OK
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1000,590);//�X��btn
		leftClick();
		robot.delay(5000);//test
		robot.mouseMove(835,400);//�Obtn
		leftClick();
		robot.delay(2000);
		click_N(30);
		System.out.println("�X�����q����");
		//�X�����q����
		robot.mouseMove(835,380);//OK btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(1200,70);//home btn
		leftClick();
		robot.delay(3000);
		robot.mouseMove(835,400);//OK btn ,�A�w�����s��о�
		leftClick();
		robot.delay(3000);
		click_N(10);
		robot.mouseMove(1245,600);//�k�U��§�� btn 
		leftClick();
		robot.delay(4000);
		robot.mouseMove(770,100);//���d�����~���btn
		leftClick();
		robot.delay(4000);
		robot.mouseMove(835,415);//OK btn 
		leftClick();
		robot.delay(3000);
		robot.mouseMove(1225,85);//��^  btn 
		leftClick();
		robot.delay(5000);
		robot.mouseMove(835,415);//OK btn ,�H�W�s��оǵ���
		leftClick();
		robot.delay(10000);
		System.out.println("Line 303");
		robot.mouseMove(1330,65);//�k�W�� X btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.mouseMove(840,435);//�p�G����͸t�F������
		leftClick();
		robot.delay(1000);
		robot.mouseMove(835,550);//OK btn ,�s�⪱�aBONUS
		leftClick();
		robot.delay(3000);
		robot.mouseMove(715,450);//�{�b���n btn ,�U���l�[�ɮ�
		leftClick();
		robot.delay(8000);
		robot.mouseMove(835,565);//MENU btn ,���}���
		leftClick();
		robot.delay(500);
		robot.mouseMove(885,525);//��J btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.delay(2000);
		
		System.exit(0);
  }
  
}
/**    
robot.mouseMove(600, 600);
robot.delay(5000);
//leftClick();
robot.mouseMove(800, 600);
robot.delay(5000);
robot.mouseMove(1000, 600);    
robot.delay(5000);

leftClick();
robot.delay(500);
leftClick();

robot.delay(500);
type("Hello, world");

robot.mouseMove(40, 160);
robot.delay(500);

leftClick();
robot.delay(500);
leftClick();

robot.delay(500);
//type("This is a test of the Java Robot class");

robot.delay(50);
type(KeyEvent.VK_DOWN);

robot.delay(250);
//type("Four score and seven years ago, our fathers ...");
*/
/**
 * A Java Robot example class.
 * 
 * Caution: Using the Java Robot class improperly can cause
 * a lot of system problems. I had to reboot my Mac ~10
 * times yesterday while trying to debug this code.
 * 
 * I created this class to demonstrate the Java Robot
 * class on a Mac OS X system, though it should run on Linux
 * or Windows as well.
 * 
 * On a Mac system, I place the TextEdit text editor in the 
 * upper-left corner of the screen, and put a bunch of blank lines 
 * in the editor. Then I run this Java Robot example from 
 * Eclipse or the Unix command line.
 * 
 * It types the three strings shown in the code below into
 * the text editor.
 *
 * Many thanks to the people on the Mac Java-dev mailing list
 * for your help. 
 * 
 * @author Alvin Alexander, http://devdaily.com
 *
 */