package test;

import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ڹ� ���б� �����ý����Դϴ�.");
		for(int i=0; i<5; i++) {
			System.out.print("�л��� �̸��� ������ �Է��ϼ��� >> ");
			String n = scanner.next();
			double s = scanner.nextDouble();
			map.put(n, s);
		}
		System.out.print("���л� ���� ���� ������ �Է��ϼ��� >> ");
		double limit = scanner.nextInt();
		System.out.print("���л� ���: ");
		for(String key : map.keySet()) {
			if(map.get(key) >= limit) {
				System.out.print(key + " ");
			}
		}
		
		scanner.close();
	}

}
