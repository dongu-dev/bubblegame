package bubblegame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Player는 implements를 한 Moveable 인터페이스를 구현해야할 의무를 가짐
public class Player extends JLabel implements Moveable {
	
	// 위치좌표
	private int x;
	private int y;

	// 행동 좌표	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
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
			
		//움직이지 않는 상태
		left = false;
		right = false;
		up = false;
		down = false;
		//
		
		setIcon(playerR); // Player클래스는 JLabel 을 상속 받았으므로 굳이 new JLabel 을 사용하지 않아도 됨
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		setIcon(PlayerL);
		x = x - 10;
		setLocation(x, y); // 왼쪽 움직이는 좌표
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y); // 오른쪽 움직이는 좌표
	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}
}
