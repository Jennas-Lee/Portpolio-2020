package test06;

import java.util.*;

public class FindDupplication {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
		for(String a : sample)
			if(!s.add(a))
				System.out.println("������ �ܾ� : " + a);
		
		System.out.println(s.size() + " �ߺ����� ���� �ܾ�  " + s);
	}

}
