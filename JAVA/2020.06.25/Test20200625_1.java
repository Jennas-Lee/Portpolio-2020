
class Student {
	
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
	
	void eat() {
		System.out.println("�ȳ�");
	}
	void sleep() {
		System.out.println("����");
	}
	
}

public class Test20200625_1 {

	public static void main(String[] args) {
		
		Student han = new Student();
		han.name = "�ѽ���";
		han.grade = 2;
		han.ban = 6;
		han.number = 25;
		han.telephone = "010-0000-0000";
		
		han.eat();
		han.sleep();
		
		System.out.println("�л��� �̸��� " + han.name + "�̰�");
		System.out.println("�л��� �г��� " + han.grade + "�̰�");
		System.out.println("�л��� ���� " + han.ban + "�̰�");
		System.out.println("�л��� ��ȣ�� " + han.number + "�̰�");
		System.out.println("�л��� ��ȭ��ȣ�� " + han.telephone + "�̴�.");
		
	}

}
