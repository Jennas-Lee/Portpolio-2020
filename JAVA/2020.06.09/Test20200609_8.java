// 2020.06.09
// 20617

import java.util.Scanner;

public class Test20200609_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.print("�л� " + i + "�� ������ �Է��Ͻÿ�: ");
			int t=sc.nextInt();
			if(t>100 || t<0) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				i--;
			} else {
				sum+=t;
			}
		}
		System.out.println("���� ����� " + (sum/n*1.0) + "�Դϴ�.");
	}

}
