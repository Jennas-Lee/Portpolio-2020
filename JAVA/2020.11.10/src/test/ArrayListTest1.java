package test;

import java.util.*;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		
		double min=10, max=0;
		double sum=0;
		for(int i=0; i<10; i++) {
			System.out.print("�ɻ����� " + (i+1) + "�� ����: ");
			double t = scanner.nextDouble();
			list.add(t);
			if(t<min) min=t;
			if(t>max) max=t;
			sum += t;
		}
		sum = sum - max - min;
		System.out.println("������ ��: " + sum);
		
		scanner.close();
	}

}
