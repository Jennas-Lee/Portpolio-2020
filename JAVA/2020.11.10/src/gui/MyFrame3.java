package gui;

import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {

	public MyFrame3() {
		setTitle("����° ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.pink);
		cp.setLayout(new GridLayout());
		
		for(int i=1; i<11; i++) {
			cp.add(new JButton("��ư " + i));
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}
