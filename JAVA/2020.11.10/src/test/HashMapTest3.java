package test;

import java.util.*;

public class HashMapTest3 {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** ���� ����Ʈ �����ý����Դϴ� ***");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String n = scanner.next();
			if(n.equals("stop")) {
				System.out.println("����Ʈ �Է��� ����˴ϴ�.");
				break;
			} else {
				double s = scanner.nextDouble();
				if(map.get(n) == null) {
					map.put(n, s);
				} else {
					double t = map.get(n);
					map.replace(n, t + s);
				}
				System.out.println("(" + n + ", " + map.get(n) + ")");
			}
		}
		
		scanner.close();
	}

}
