package test06;

import java.util.*;

class Student {
	String name;
	String _class;
	String num;
	String score;
	
	public Student(String name, String _class, String num, String score) {
		this.name = name;
		this._class = _class;
		this.num = num;
		this.score = score;
	}
}

public class StudentScore {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			String name, _class, num, score;
			System.out.println((i+1) + "�� �л� ����");
			System.out.print("�̸� : ");
			name = scanner.nextLine();
			System.out.print("�а� : ");
			_class = scanner.nextLine();
			System.out.print("�й� : ");
			num = scanner.nextLine();
			System.out.print("���� : ");
			score = scanner.nextLine();
			Student t = new Student(name, _class, num, score);
			list.add(t);
		}
		
		System.out.println("=====�л����� ���=====");
		for(int i=0; i<4; i++) {
			Student t = list.get(i);
			System.out.println((i+1) + "�� �л� ����");
			System.out.println("�̸� : " + t.name);
			System.out.println("�а� : " + t._class);
			System.out.println("�й� : " + t.num);
			System.out.println("���� : " + t.score);
		}
		
		System.out.println("=====�л��̸� �˻�=====");
		System.out.print("�̸� : ");
		for(int i=0; i<4; i++) {
			Student t = list.get(i);
			if(t.name.equals(scanner.nextLine())) {
				System.out.println(t.name + "�� ���� : " + t.score);
				break;
			} else {
				continue;
			}
		}
		
		scanner.close();
	}
}
