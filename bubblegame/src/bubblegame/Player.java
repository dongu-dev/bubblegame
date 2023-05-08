package bubblegame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel{
	
	private int x;
	private int y;
	
	private ImageIcon playerR;
	private ImageIcon PlayerL;
	
	public Player() {
		initObject();
		initSetting();
	}
	
	private void initObject() {
		playerR = new ImageIcon("image/PlayerR.png");
		PlayerL = new ImageIcon("image/PlayerL.png");
	}
	
	private void initSetting() {
		x = 55;
		y = 535;
		
		setIcon(playerR); //Player클래스는 JLabel 을 상속 받았으므로 굳이 new JLabel 을 사용하지 않아도 됨
		setSize(50,50);
		setLocation(x,y);
	}
}
