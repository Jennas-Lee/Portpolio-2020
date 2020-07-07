package Test_06;

import java.util.Scanner;

class Car {
	
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tank;
	private double fuel;
	private double sfc;
	
	Car(
			String name,
			String number,
			int width,
			int height,
			int length,
			double tank,
			double fuel,
			double sfc
			) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tank = tank;
		this.fuel = (fuel <= tank) ? fuel : tank;
		this.sfc = sfc;
		x = 0.0;
		y = 0.0;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getFuel() {
		return fuel;
	}
	
	void putSpec() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + number);
		System.out.println("�ʺ� : " + width + "mm");
		System.out.println("���� : " + height + "mm");
		System.out.println("���� : " + length + "mm");
		System.out.println("�뷮 : " + tank + "L");
		System.out.println("���ᷮ : " + fuel + "L");
		System.out.println("���� : " + sfc + "km/L");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		double f = dist / sfc;
		if(f > fuel) {
			return false;
		} else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	void refuel(double df) {
		if(df > 0) {
			fuel += df;
			if(fuel > tank) {
				fuel = tank;
			}
		}
	}
	
}

public class Test20200707_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car k3 = new Car("K3", "01��1234", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		k3.putSpec();
		while(true) {
			System.out.printf("���� ��ġ : (%.2f, %.2f)\n", k3.getX(), k3.getY());
			System.out.printf("���� ���� : %.2f\n", k3.getFuel());
			System.out.print("�̵��Ͻðڽ��ϱ�? [0...NO/1...YES] : ");
			if(sc.nextInt() == 0) {
				break;
			}
			System.out.print("x �������� �̵��� �Ÿ� : ");
			double dx = sc.nextDouble();
			System.out.print("y �������� �̵��� �Ÿ� : ");
			double dy = sc.nextDouble();
			
			if(!k3.move(dx, dy)) {
				System.out.println("���ᰡ �����մϴ�.");
			}
		}
		
	}

}
