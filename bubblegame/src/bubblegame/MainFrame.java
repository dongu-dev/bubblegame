package bubblegame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{
	
	private JLabel backgroundMap;
	private Player player;
	
	public MainFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);//JPanel생성=>JFrame 하위 창이 JPanel임
		
		player = new Player();
		add(player);
	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); //자유롭게 그림그리기
		setLocationRelativeTo(null); //창이 가운데 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 끄면서 프로세스 JVM 종료
	}
	
	private void initListener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
			
				//위 : 38, 아래 : 40, 왼쪽 : 37, 오른쪽 : 39
				switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT: //왼쪽 버튼 눌렀을 때 Player를 움직이게 함
						player.left();
						break;
					case KeyEvent.VK_RIGHT:
						player.right();
						break;
					case KeyEvent.VK_UP:
						player.up();
						break;
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
