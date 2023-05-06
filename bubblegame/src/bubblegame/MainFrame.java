package bubblegame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{
	
	private JLabel backgroundMap;
	
	public MainFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	private void initObject() {
		backgroundMap = new JLabel("안녕");
		add(backgroundMap); // JFrame에 JLabel이 그려짐
	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); //자유롭게 그림그리기
		setLocationRelativeTo(null); //창이 가운데 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 끄면서 프로세스 JVM 종료
	}
}
