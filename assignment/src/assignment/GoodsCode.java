package assignment;

import java.util.Scanner;

public class GoodsCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] codeArr = { 50000, 30000, 35000, 40000, 80000 };
		while (true) {
			System.out.print("��ǰ�ڵ带 �Է����ּ���. : ");
			int code = sc.nextInt();
			if (code > 5 || code < 1) {
				System.out.println("�߸� �� ��ǰ�ڵ��Դϴ�. ������ �ٽ� �õ����ּ���.");
				break;
			}
			System.out.print("��ǰ�� ������ �Է����ּ���. : ");
			int count = sc.nextInt();

			switch (code) {
			case 1:
				System.out.println(codeArr[0] * count);
				break;
			case 2:
				System.out.println(codeArr[1] * count);
				break;
			case 3:
				System.out.println(codeArr[2] * count);
				break;
			case 4:
				System.out.println(codeArr[3] * count);
				break;
			case 5:
				System.out.println(codeArr[4] * count);
				break;

			default:
				break;
			}
		}
	}
}
