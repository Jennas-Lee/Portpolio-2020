package test06;

import java.util.*;

public class VectorRain {

	public static void main(String[] args) {
		Vector<Integer> rain = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�������� �Է��ϼ���. 0�� �Է��ϸ� �����˴ϴ�. : ");
			int t = scanner.nextInt();
			double sum = 0.0;
			rain.add(t);
			System.out.println("���� �Էµ� ��� ������");
			for(int u : rain) {
				System.out.print(u + ", ");
				sum += u;
			}
			System.out.println("\n���� �Էµ� �������� ��� : " + (sum/rain.size()));
			if(t == 0) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			} else {
				continue;
			}
		}
	}

}
