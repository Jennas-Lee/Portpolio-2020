package test06;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		String nation, sch_key;
		int ingu;
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			nation = scanner.next();
			if(nation.equals("stop")) {
				break;
			} else {
				ingu = scanner.nextInt();
				nations.put(nation, ingu);
			}
		}
		System.out.println("�˻��� ���� �̸��� �Է��ϼ���.(��: Korea)");
		while(true) {
			nation = scanner.next();
			if(nation.equals("stop")) {
				break;
			} else {
				int tmp = nations.get(nation);
				if(tmp == 1) {
					System.out.println(nation + "��(��) ���� �ܾ��Դϴ�.");
				} else {
					System.out.println(tmp);
				}
			}
		}
	}

}
