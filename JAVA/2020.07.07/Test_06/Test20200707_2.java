package Test_06;

class Human {
	
	private String name;
	private int height;
	private int weight;
	
	Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}
	
	String getName() {
		return name;
	}
	
	int getHeight() {
		return height;
	}
	
	int getWeight() {
		return weight;
	}
	
	void gainWeight(int w) {
		weight += w;
	}
	
	void reduceWeight(int w) {
		weight -= w;
	}
	
}

public class Test20200707_2 {

	public static void main(String[] args) {
		
		Human gildong = new Human("ȫ�浿", 170, 60);
		Human chulsu = new Human("��ö��", 166, 72);
		
		System.out.println("�̸� : " + gildong.getName() + " | Ű : " + gildong.getHeight() + " | ������ : " + gildong.getWeight());
		gildong.gainWeight(10);
		System.out.println("�̸� : " + gildong.getName() + " | Ű : " + gildong.getHeight() + " | ������ : " + gildong.getWeight());
		gildong.reduceWeight(5);
		
		System.out.println("�̸� : " + chulsu.getName() + " | Ű : " + chulsu.getHeight() + " | ������ : " + chulsu.getWeight());
		
	}

}
