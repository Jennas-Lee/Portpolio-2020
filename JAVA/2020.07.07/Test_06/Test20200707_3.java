package Test_06;

class Xcar {
	
	private int num;
	private double gas;
	
	void setNumGas(int n, double g) {
		if(g > 0 && g < 1000 ) {
			num = n;
			gas = n;
		} else {
			System.out.println(g + "��(��) �ùٸ� ���ᷮ�� �ƴմϴ�.");
			System.out.println("���ᷮ�� ������ �� �����ϴ�.");
		}
	}
	
	void show() {
		System.out.println("������ȣ�� " + num + "�Դϴ�.");
		System.out.println("���ᷮ��  " + gas + "�Դϴ�.");
	}
	
}

public class Test20200707_3 {
	
	public static void main(String[] args) {
		
		Xcar car1 = new Xcar();
		car1.setNumGas(1234, -10.2);
		car1.show();
		car1.setNumGas(1234, 10.2);
		car1.show();
		
	}
	
}
