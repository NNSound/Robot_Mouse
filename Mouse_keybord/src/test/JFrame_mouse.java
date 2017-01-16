package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class JFrame_mouse extends JFrame implements MouseMotionListener {

	private JPanel contentPane;
	JLabel text;
	/**
	 * Launch the application.
	 * �Ыؤ@��Jframe �������U�ƹ����ƥ�
	 * 1.���U��N�ƹ��y�п�X��txt���A�ðO���ɶ�
	 * 2.���@�ӥi�HŪ��txt�ɮת��Ƶ{���ΥH�]txt�����}��
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_mouse frame = new JFrame_mouse();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public JFrame_mouse() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));		
		setContentPane(contentPane);
		
		JPanel JP =new JPanel();
		contentPane.add(JP);
		JP.addMouseMotionListener(this);;
		
		text = new JLabel("something happened..");
		JP.add(text);
	}
	public void mouseDragged(MouseEvent e) {
        text.setText("x: " + e.getX() + ", y: " + e.getY());
        System.out.println("mouseDragged");
     }
     
    public void mouseMoved(MouseEvent e) {
        text.setText("x: " + e.getX() + ", y: " + e.getY());
        System.out.println("mouseMoved");
    }

}
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}