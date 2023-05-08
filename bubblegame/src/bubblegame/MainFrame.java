package bubblegame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{
	
	private JLabel backgroundMap;
	private Player player;
	
	public MainFrame() {
		initObject();
		initSetting();
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
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
