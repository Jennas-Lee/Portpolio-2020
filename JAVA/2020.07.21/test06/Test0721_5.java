package test06;

class Box {
	
	int w, l, h, v;
	
	Box(int w, int l, int h) {
		this.w = w;
		this.l = l;
		this.h = h;
		v = w * l * h; 
	}
	
	Box whoLargest(Box box1, Box box2) {
		if(box1.v > box2.v)
			return box1;
		else
			return box2;
	}
	
	String sameVolume(Box box1, Box box2) {
		if(box1.v == box2.v)
			return "���ǰ� �����մϴ�.";
		else
			return "���ǰ� �ٸ��ϴ�.";
	}
	
	boolean compare(Box box1, Box box2) {
		if(box1.w == box2.w && box1.l == box2.l && box1.h == box2.h)
			return true;
		else
			return false;
	}
	
}

public class Test0721_5 {

	public static void main(String[] args) {
		
		Box box1 = new Box(10, 20, 50);
		Box box2 = new Box(10, 30, 30);
		
		Box largest = box1.whoLargest(box1, box2);
		System.out.println("ū ������ ũ��");
		System.out.println("���� : " + largest.w);
		System.out.println("���� : " + largest.l);
		System.out.println("���� : " + largest.h);
		System.out.println("���� : " + largest.v);
		System.out.println(box1.sameVolume(box1, box2));
		System.out.println(box1.compare(box1, box2) == true ? "ũ�Ⱑ �����մϴ�." : "ũ�Ⱑ �ٸ��ϴ�.");
		
	}

}
