package test;

import java.awt.*;
import javax.swing.*;

public class MyFrameTest1 extends JFrame {
	
	public MyFrameTest1() {
		setTitle("�׽�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel la = new JLabel("�ڹٴ� ����ֳ���?");
		cp.add(la);
				
		JButton btn1 = new JButton("Yes");
		cp.add(btn1);
		
		JButton btn2 = new JButton("No");
		cp.add(btn2);
		
		setSize(500, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrameTest1();
	}

}
