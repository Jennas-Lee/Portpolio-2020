package gui;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("�ι�° ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.orange);
		cp.setLayout(new GridLayout(3, 3, 10, 10));
		
		cp.add(new JButton("��ư 1"));
		cp.add(new JButton("��ư 2"));
		cp.add(new JButton("��ư 3"));
		cp.add(new JButton("��ư 4"));
		cp.add(new JButton("��ư 5"));
		cp.add(new JButton("��ư 6"));
		cp.add(new JButton("��ư 7"));
		cp.add(new JButton("��ư 8"));
		cp.add(new JButton("��ư 9"));
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

}
