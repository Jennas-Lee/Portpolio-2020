package test;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel la = new JLabel("�ڹ� ����");
		cp.add(la);
		la.setForeground(Color.PINK);
		la.setFont(new Font("�ü�ü", Font.BOLD, 40));
		la.setBackground(Color.DARK_GRAY);
		la.setOpaque(true);
		
		JTextField text = new JTextField(20);
		cp.add(text);
		
		JButton btn = new JButton("���� ����");
		cp.add(btn);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
