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
  static long time1,time2,total,num=0;//設置系統時間 以觀測時間效率
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
    time1 = System.currentTimeMillis();//開始時間//等等放到迴圈裡
    
    NEWGAME();
    /*
	//進入副督酒廠--------------------------
	robot.mouseMove(530,65);//btn 前往各酒廠
	leftClick();
	robot.delay(500);
	robot.mouseMove(760,320);//btn 副都酒廠
	leftClick();
	robot.delay(3000);
	*/
	//副督END--------------------------------------
	
	Lucky();
	Lucky();
	Lucky();
	//看腳色-----------------------------------------
	robot.mouseMove(1200,70);//按地圖btn
	leftClick();
	robot.delay(3000);
	robot.mouseMove(835,420);//OKMENU btn 可能會有任務發生 可能沒有
	leftClick();
	robot.delay(500);
	robot.mouseMove(835,565);//MENU btn ,打開欄位
	leftClick();
	robot.delay(500);
	robot.mouseMove(560,535);//按隊伍btn
	leftClick();
	robot.delay(1000);
	robot.mouseMove(560,400);//按編成btn
	leftClick();
	robot.delay(2000);
	robot.mouseMove(1225,400);//按預備腳色btn
	leftClick();	  
	robot.delay(1000);
	//看腳色END---------------------------------------
    picture();
    //進去設定--------------------------------------
    robot.mouseMove(1225,585);//按地圖 btn
	leftClick();
	robot.delay(3000);
	robot.mouseMove(835,565);//MENU btn ,打開欄位
	leftClick();
	robot.delay(500);
	robot.mouseMove(1210,525);//選單 btn ,打開欄位
	leftClick();
	robot.delay(3000);
	//----------------------------------------------
    slied(575,550);
    password();
    picture();
	replayGAME();
	robot.delay(1000);
	time2 = System.currentTimeMillis();//結束時間
	total=(((time2-time1)/1000)/60);
	System.out.println(total+"min");//印出所花費的時間
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
		robot.delay(18000);//等待進入遊戲畫面
		
		click_N(10,950,500);
		
		leftClick();//點及登入畫面	
		robot.mouseMove(950, 500);//同意條款btn
		leftClick();	
		
		System.out.println("等開頭動畫");
		robot.delay(60000);//等開頭動畫
		robot.delay(25000);	//25S 有時不行
		
		click_N(25);
		skip();
		click_N(16);//等闢利卡廢話
		fast();
		
		robot.mouseMove(900, 300);//點及腳色	
		leftClick();
		robot.delay(500);
		robot.mouseMove(900,450);//移動腳色到下方	
		leftClick();
		robot.delay(8000);
		
		click_N(18);//等闢利卡廢話      
		robot.mouseMove(900,200);//腳色移動到上方
		leftClick();
		robot.delay(5000);
		click_N(24,1000,600);//戰鬥結算
		
		skip();
		robot.delay(12000);
		//-------------------------------------------------
		click_N(20,1000,600);//等闢利卡廢話	
		System.out.println("開必殺");		
		//robot.mouseMove(1000,600);//使用必殺技
		//leftClick();
		click_N(25);//戰鬥結算
		robot.delay(1000);
		skip();
		
		System.out.println("獲得凱恩 按OK");	
		robot.mouseMove(1200,470);//獲得凱恩 按OK
		leftClick();
		robot.delay(1000);
		
		skip();
		click_N(16);
		robot.mouseMove(835,250);//前往事件1
		leftClick();
		robot.delay(8000);
		fast();//要改
		robot.delay(8000);
		
		click_N(16,1010,350); //戰鬥結算		
		System.out.println("測試!!進入副都by Ckick_N");
		robot.mouseMove(1010,350);//進入副都跑掉要改 試試看
		leftClick();
		robot.delay(2000);
		
		click_N(25);//大叔廢話
		System.out.println("大叔廢話");
		robot.mouseMove(1000,250);//main_story 1-1 
		leftClick();
		robot.delay(8000);
		skip();
		//robot.mouseMove(835,450);
		robot.delay(6000);//載入戰鬥
		fast();
		robot.delay(25000);//戰鬥ING
		click_N(20);//戰鬥結算+闢利卡費畫
		robot.mouseMove(1000,250);//main_story 1-1.2
		leftClick();
		robot.delay(5000);
		skip();
		robot.delay(5000);//載入戰鬥
		fast();
		robot.delay(30000);//2Wave
		click_N(22);//戰鬥結算
		robot.mouseMove(835,450);//升級確認 1-1.2
		leftClick();
		robot.delay(10000);
		skip();//沒按到 下次檢查
		
		click_N(20,500,350);
		System.out.println("測試!!!進入酒廠by Click_N");
		//以下開始進入酒廠
		robot.mouseMove(500,350);//酒廠按鈕
		leftClick();
		robot.delay(2000);
		
		click_N(22);//要測
		
		robot.mouseMove(800,380);//btn 兩張一起轉 座標錯了
		leftClick();
		robot.delay(2000);
		robot.mouseMove(835,385);//btn 抽轉蛋
		leftClick();
		robot.delay(1000);	
		click_N(8);
		skip();
		click_N(5);
		skip();
		robot.mouseMove(1200,470);//抽到兩隻按ok
		leftClick();
		robot.delay(1000);
		click_N(50);//占卜+大叔廢話
		//按main_story1-2.1
		robot.mouseMove(1000,250);
		leftClick();
		robot.delay(10000);
		skip();
		click_N(24);//等萬象廢話
		fast();
		robot.delay(8000);
		click_N(12);//等廢物廢話
		robot.mouseMove(1235,300);//點及弓手
		leftClick();
		robot.mouseMove(1235,200);//移動到上方
		leftClick();
		robot.delay(8000);
		click_N(10);//等強運廢話
		System.out.println("Line 161");
		robot.delay(5000);
		click_N(28);//戰鬥結算
		skip();//跳過受傷傭兵動畫
		robot.mouseMove(1200,470);//獲得克雷格 按OK
		leftClick();
		robot.delay(3000);
		click_N(16);//等萬象廢話
		//編輯隊伍
		robot.mouseMove(560,535);//按隊伍btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(560,400);//按編成btn
		leftClick();
		robot.delay(2000);
		click_N(26);//等萬象廢話 這邊會把下面跳過 改過1次 要試試
	/**
		robot.mouseMove(915,335);//按後備1欄位
		leftClick();
		robot.delay(3000);
		robot.mouseMove(915,335);//選擇克雷格
		leftClick();
		robot.delay(3000);
		click_N(12);//等萬象廢話
		robot.delay(3000);
		robot.mouseMove(1000,250);//按main1-2.2
		leftClick();
		robot.delay(8000);	
	*/    
		skip();	
		robot.delay(18000);
		click_N(10);//等萬象廢話
		fast();
		robot.delay(35000);//等3wave戰鬥
		click_N(18);//戰鬥結束
		skip();//跳過動畫(萬象臉)
		robot.delay(10000);
		click_N(20);//大叔對話
		//2565,70 地圖btn
		robot.mouseMove(1200,70);//按地圖btn
		leftClick();
		robot.delay(3000);
		System.out.println("Line 199");
		//2090,295
		robot.mouseMove(725,295);//按路上小怪btn 往左下第1個
		leftClick();
		robot.delay(5000);
		click_N(10);//闢利卡廢話+選友
		//2505,570
		robot.mouseMove(1140,570);//任務開始btn
		leftClick();
		robot.delay(18000);//載入戰鬥
		fast();
		robot.delay(30000);//2wave 戰鬥
		click_N(18);//戰鬥結算	
		robot.delay(4000);
		robot.mouseMove(625,520);//成為好友，按否
		leftClick();
		robot.delay(5000);
		click_N(10);//下面跑掉了
		
		robot.mouseMove(765,270);//按路上小怪btn 往左下第2個
		leftClick();
		robot.delay(4000);
		click_N(6);
		robot.mouseMove(1140,570);//任務開始btn 共3wave
		leftClick();
		robot.delay(15000);//等待載入戰鬥
		//這邊需要移動戰士 2275 200 && 2275 450 往前到1800
		fast();
		robot.mouseMove(910,200);//點凱恩
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,200);//點小兵
		leftClick();
		robot.mouseMove(910,450);//點好友
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,450);//點小兵
		leftClick();
		robot.delay(37000);//等3wave 可能要改 因為有加速了
		click_N(18);//戰鬥結算
		robot.mouseMove(625,520);//成為好友，按否
		leftClick();
		robot.delay(3000);
		click_N(20);//戰鬥結算
		robot.mouseMove(1200,470);//獲得凱恩 按OK
		leftClick();
		click_N(14);//等闢利卡廢話
		System.out.println("Line 247");
	    //1925 540
		robot.mouseMove(560,500);//按聖靈btn
		leftClick();
		robot.mouseMove(660,400);//按編成btn
		leftClick();
		click_N(10);//等占卜師廢話
		//合成欄 (500,300)
		robot.mouseMove(500,300);//欄位選擇
		leftClick();
		robot.delay(2000);
		robot.mouseMove(600,300);//卡片選擇
		leftClick();
		robot.delay(2000);
		click_N(8);//連點四秒 等占卜師廢話 連點跳過下面
	/**
		robot.mouseMove(900,250);//素材欄位選擇
		leftClick();
		robot.delay(2000);
		leftClick();//選擇凱恩
	*/
		robot.delay(2000);
		robot.mouseMove(1235,350);//選擇OK
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1000,590);//合成btn
		leftClick();
		robot.delay(5000);//test
		robot.mouseMove(835,400);//是btn
		leftClick();
		robot.delay(2000);
		click_N(30);
		System.out.println("合成階段結束");
		//合成階段結束
		robot.mouseMove(835,380);//OK btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(1200,70);//home btn
		leftClick();
		robot.delay(3000);
		robot.mouseMove(835,400);//OK btn ,你已完成新手教學
		leftClick();
		robot.delay(3000);
		click_N(10);
		robot.mouseMove(1245,600);//右下方禮物 btn 
		leftClick();
		robot.delay(4000);
		robot.mouseMove(770,100);//除卡片之外領取btn
		leftClick();
		robot.delay(4000);
		robot.mouseMove(835,415);//OK btn 
		leftClick();
		robot.delay(3000);
		robot.mouseMove(1225,85);//返回  btn 
		leftClick();
		robot.delay(5000);
		robot.mouseMove(835,415);//OK btn ,以上新手教學結束
		leftClick();
		robot.delay(10000);
		System.out.println("Line 303");
		robot.mouseMove(1330,65);//右上角 X btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.mouseMove(840,435);//如果有選友聖靈幣的話
		leftClick();
		robot.delay(1000);
		robot.mouseMove(835,550);//OK btn ,新手玩家BONUS
		leftClick();
		robot.delay(3000);
		robot.mouseMove(715,450);//現在不要 btn ,下載追加檔案
		leftClick();
		robot.delay(8000);
		robot.mouseMove(835,565);//MENU btn ,打開欄位
		leftClick();
		robot.delay(500);
		robot.mouseMove(885,525);//轉蛋 btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.delay(2000);
  }
  private void skip()
  {
	  robot.mouseMove(1220,75);
	  leftClick();
	   robot.delay(5000);//原本等10秒
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
	  robot.mouseMove(550,515);//btn 抽一個
	  leftClick();
	  robot.delay(1000);
	  robot.mouseMove(935,400);//
	  leftClick();
	  robot.delay(2000);
	  click_N(8);
	  skip();
	  robot.mouseMove(835,415);//OK btn 夥伴加入有新任務
	  leftClick();
	  robot.delay(500);
	  robot.mouseMove(835,425);//OK btn 夥伴加入有新任務
	  leftClick();
	  robot.delay(1500);
	  robot.mouseMove(1200,470);//獲得腳色 按OK
	  leftClick();
	  robot.delay(5000);
  }
  //1640,240
  private void picture(String name) throws IOException{
	  //還有兩個OK要測
	  Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);
		BufferedImage picture = robot.createScreenCapture(screenRect);
		ImageIO.write(picture, "jpg", new File(name+num+".jpg"));
		
  }
  private void picture() {
	  //還有兩個OK要測
	 
	  robot.mouseMove(275,240);//截圖 btn 
	  leftClick();
	  robot.delay(6000);
	  
	  robot.mouseMove(1000,515);//截圖 btn 
	  leftClick();
	  robot.delay(6000);
	  
	  
	  robot.mouseMove(760,450);//儲存 btn 
	  leftClick();
	  robot.delay(6000);
	  	  
  }
  private void slied(int x,int y)
  {
	  robot.mouseMove(x,y);//起始位置
	  robot.mousePress(InputEvent.BUTTON1_MASK);
	  for(int i=0;i<y-50;i=i+10){
		  robot.mouseMove(x,y-i);
		  robot.delay(100);
	  }
	  robot.mouseRelease(InputEvent.BUTTON1_MASK);  
	  /**
		//拖曳------------------------------------------
		robot.mouseMove(850,400);//轉蛋 btn 
		robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
		for(int i=0;i<300;i=i+5){
			robot.mouseMove(850,400-i);//轉蛋 btn 	    
		}
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    //拖曳結束--------------------------------------
		*/
  }
  private void password(){
	    robot.mouseMove(585,510);//btn設定轉移馬
		leftClick();
		robot.delay(500);
		//2300,240
		robot.mouseMove(975,240);//設定轉移馬密碼
		leftClick();
		robot.delay(1000);
		for(int i=0;i<8;i++)
			type(KeyEvent.VK_NUMPAD0);
		//type("00000000");
		robot.mouseMove(975,240);//btn設定轉移密馬 第二次輸入
		leftClick();
		robot.delay(500);
		robot.mouseMove(975,330);//btn設定轉移密馬 第二次輸入
		leftClick();
		robot.delay(1000);
		for(int i=0;i<8;i++)
			type(KeyEvent.VK_NUMPAD0);

		robot.mouseMove(975,480);//案旁邊一夏
		leftClick();
		robot.delay(500);
		robot.mouseMove(975,480);//btn設定
		leftClick();
		robot.delay(500);
		//確認之後拍照 再到設定刪除資料 就好了
		robot.mouseMove(835,480);//btn設定
		leftClick();
		robot.delay(500);
  }
  private void replayGAME(){
	//2125,15
	    robot.mouseMove(760,15);//btn 關掉APP
		leftClick();
		robot.delay(3000);
		robot.mouseMove(555,15);//btn設定
		leftClick();
		robot.delay(2000);
		robot.mouseMove(435,180);//btn應用城市
		leftClick();
		robot.delay(2000);
		robot.mouseMove(535,260);//btn CC APP
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1065,415);//btn 清除資料
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1010,400);//btn 確定
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
		click_N(20,1000,600);//等闢利卡廢話	
		System.out.println("開必殺");		
		//robot.mouseMove(1000,600);//使用必殺技
		//leftClick();
		click_N(25);//戰鬥結算
		robot.delay(1000);
		skip();
		
		System.out.println("獲得凱恩 按OK");	
		robot.mouseMove(1200,470);//獲得凱恩 按OK
		leftClick();
		robot.delay(1000);
		
		skip();
		click_N(16);
		robot.mouseMove(835,250);//前往事件1
		leftClick();
		robot.delay(8000);
		fast();//要改
		robot.delay(8000);
		
		click_N(16,1010,350); //戰鬥結算		
		System.out.println("測試!!進入副都by Ckick_N");
		robot.mouseMove(1010,350);//進入副都跑掉要改 試試看
		leftClick();
		robot.delay(2000);
		
		click_N(20);//大叔廢話
		System.out.println("大叔廢話");
		robot.mouseMove(1000,250);//main_story 1-1 
		leftClick();
		robot.delay(8000);
		skip();
		//robot.mouseMove(835,450);
		robot.delay(6000);//載入戰鬥
		fast();
		robot.delay(25000);//戰鬥ING
		click_N(20);//戰鬥結算+闢利卡費畫
		robot.mouseMove(1000,250);//main_story 1-1.2
		leftClick();
		robot.delay(5000);
		skip();
		robot.delay(5000);//載入戰鬥
		fast();
		robot.delay(30000);//2Wave
		click_N(22);//戰鬥結算
		robot.mouseMove(835,450);//升級確認 1-1.2
		leftClick();
		robot.delay(10000);
		skip();//沒按到 下次檢查
		
		click_N(20,500,350);
		System.out.println("測試!!!進入酒廠by Click_N");
		//以下開始進入酒廠
		robot.mouseMove(500,350);//酒廠按鈕
		leftClick();
		robot.delay(2000);
		
		click_N(22);//要測
		
		robot.mouseMove(800,380);//btn 兩張一起轉 座標錯了
		leftClick();
		robot.delay(2000);
		robot.mouseMove(835,385);//btn 抽轉蛋
		leftClick();
		robot.delay(1000);	
		click_N(8);
		skip();
		click_N(5);
		skip();
		robot.mouseMove(1200,470);//抽到兩隻按ok
		leftClick();
		robot.delay(1000);
		click_N(50);//占卜+大叔廢話
		//按main_story1-2.1
		robot.mouseMove(1000,250);
		leftClick();
		robot.delay(10000);
		skip();
		click_N(24);//等萬象廢話
		fast();
		robot.delay(8000);
		click_N(12);//等廢物廢話
		robot.mouseMove(1235,300);//點及弓手
		leftClick();
		robot.mouseMove(1235,200);//移動到上方
		leftClick();
		robot.delay(8000);
		click_N(10);//等強運廢話
		System.out.println("Line 161");
		robot.delay(5000);
		click_N(28);//戰鬥結算
		skip();//跳過受傷傭兵動畫
		robot.mouseMove(1200,470);//獲得克雷格 按OK
		leftClick();
		robot.delay(3000);
		click_N(16);//等萬象廢話
		//編輯隊伍
		robot.mouseMove(560,535);//按隊伍btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(560,400);//按編成btn
		leftClick();
		robot.delay(2000);
		click_N(26);//等萬象廢話 這邊會把下面跳過 改過1次 要試試
	/**
		robot.mouseMove(915,335);//按後備1欄位
		leftClick();
		robot.delay(3000);
		robot.mouseMove(915,335);//選擇克雷格
		leftClick();
		robot.delay(3000);
		click_N(12);//等萬象廢話
		robot.delay(3000);
		robot.mouseMove(1000,250);//按main1-2.2
		leftClick();
		robot.delay(8000);	
	*/    
		skip();	
		robot.delay(18000);
		click_N(10);//等萬象廢話
		fast();
		robot.delay(35000);//等3wave戰鬥
		click_N(18);//戰鬥結束
		skip();//跳過動畫(萬象臉)
		robot.delay(10000);
		click_N(20);//大叔對話
		//2565,70 地圖btn
		robot.mouseMove(1200,70);//按地圖btn
		leftClick();
		robot.delay(3000);
		System.out.println("Line 199");
		//2090,295
		robot.mouseMove(725,295);//按路上小怪btn 往左下第1個
		leftClick();
		robot.delay(5000);
		click_N(10);//闢利卡廢話+選友
		//2505,570
		robot.mouseMove(1140,570);//任務開始btn
		leftClick();
		robot.delay(18000);//載入戰鬥
		fast();
		robot.delay(30000);//2wave 戰鬥
		click_N(18);//戰鬥結算	
		robot.delay(4000);
		robot.mouseMove(625,520);//成為好友，按否
		leftClick();
		robot.delay(5000);
		click_N(10);//下面跑掉了
		
		robot.mouseMove(765,270);//按路上小怪btn 往左下第2個
		leftClick();
		robot.delay(4000);
		click_N(6);
		robot.mouseMove(1140,570);//任務開始btn 共3wave
		leftClick();
		robot.delay(15000);//等待載入戰鬥
		//這邊需要移動戰士 2275 200 && 2275 450 往前到1800
		fast();
		robot.mouseMove(910,200);//點凱恩
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,200);//點小兵
		leftClick();
		robot.mouseMove(910,450);//點好友
		leftClick();
		robot.delay(500);
		robot.mouseMove(435,450);//點小兵
		leftClick();
		robot.delay(37000);//等3wave 可能要改 因為有加速了
		click_N(18);//戰鬥結算
		robot.mouseMove(625,520);//成為好友，按否
		leftClick();
		robot.delay(3000);
		click_N(20);//戰鬥結算
		robot.mouseMove(1200,470);//獲得凱恩 按OK
		leftClick();
		click_N(14);//等闢利卡廢話
		System.out.println("Line 247");
	    //1925 540
		robot.mouseMove(560,500);//按聖靈btn
		leftClick();
		robot.mouseMove(660,400);//按編成btn
		leftClick();
		click_N(10);//等占卜師廢話
		//合成欄 (500,300)
		robot.mouseMove(500,300);//欄位選擇
		leftClick();
		robot.delay(2000);
		robot.mouseMove(600,300);//卡片選擇
		leftClick();
		robot.delay(2000);
		click_N(8);//連點四秒 等占卜師廢話 連點跳過下面
	/**
		robot.mouseMove(900,250);//素材欄位選擇
		leftClick();
		robot.delay(2000);
		leftClick();//選擇凱恩
	*/
		robot.delay(2000);
		robot.mouseMove(1235,350);//選擇OK
		leftClick();
		robot.delay(2000);
		robot.mouseMove(1000,590);//合成btn
		leftClick();
		robot.delay(5000);//test
		robot.mouseMove(835,400);//是btn
		leftClick();
		robot.delay(2000);
		click_N(30);
		System.out.println("合成階段結束");
		//合成階段結束
		robot.mouseMove(835,380);//OK btn
		leftClick();
		robot.delay(1000);
		robot.mouseMove(1200,70);//home btn
		leftClick();
		robot.delay(3000);
		robot.mouseMove(835,400);//OK btn ,你已完成新手教學
		leftClick();
		robot.delay(3000);
		click_N(10);
		robot.mouseMove(1245,600);//右下方禮物 btn 
		leftClick();
		robot.delay(4000);
		robot.mouseMove(770,100);//除卡片之外領取btn
		leftClick();
		robot.delay(4000);
		robot.mouseMove(835,415);//OK btn 
		leftClick();
		robot.delay(3000);
		robot.mouseMove(1225,85);//返回  btn 
		leftClick();
		robot.delay(5000);
		robot.mouseMove(835,415);//OK btn ,以上新手教學結束
		leftClick();
		robot.delay(10000);
		System.out.println("Line 303");
		robot.mouseMove(1330,65);//右上角 X btn 
		leftClick();
		robot.delay(2000);
		click_N(6);
		robot.mouseMove(840,435);//如果有選友聖靈幣的話
		leftClick();
		robot.delay(1000);
		robot.mouseMove(835,550);//OK btn ,新手玩家BONUS
		leftClick();
		robot.delay(3000);
		robot.mouseMove(715,450);//現在不要 btn ,下載追加檔案
		leftClick();
		robot.delay(8000);
		robot.mouseMove(835,565);//MENU btn ,打開欄位
		leftClick();
		robot.delay(500);
		robot.mouseMove(885,525);//轉蛋 btn 
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