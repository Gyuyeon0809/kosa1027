import java.util.Scanner;
public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		Account acc= new Account("1111","�̼���",100);
		Account acc1= new Account("2222","�̻��",100);
		Account acc2= new Account("3333","�����",100);
		*/
		int arrayNum = 0; // �迭�� ���� ��ȣ ������ ���� ����
		Account [] accs = new Account[100];
		// �迭�� index�� 0�� ���� ����
		boolean run = true;
		// while(run) {
		do {	
			System.out.println("1. ���µ�� | 2. ���� ��� "
					+ "| 3. ���� | 4. ��� | 5. ����");
			System.out.print("���� > ");
			int selecNo = sc.nextInt(); // 123456\n
			sc.nextLine(); // �Է���ġ�� \n���� �ִ� ���� ���ֱ� ���� ���
			switch(selecNo) {
			case 1 : 
				System.out.println("���µ�� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.print("������ : ");
				String owner = sc.nextLine();
				System.out.print("�ݾ� : ");
				int money = sc.nextInt();
				accs[arrayNum] = new Account(accountNo,owner, money);
				arrayNum++;
				System.out.println("���µ���� �Ϸ�Ǿ����ϴ�.\n");
				break;
			case 2 :
				System.out.println("���¸�� �������Դϴ�.");
				System.out.println("���� ��ȣ \t\t ������ \t\t �ݾ�");
				for(int i = 0 ; i < accs.length; i++) {
					if(accs[i] == null) break;
					System.out.println(accs[i].getAccountNo()+"\t\t"
							+accs[i].getOwner()+"\t\t"
							+accs[i].getBalance());
				}
				System.out.println();
				break;
			case 3 :
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ  : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = null;
				for(int i = 0 ; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
					// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc������
							acc = accs[i];
							// acc = accs[0], acc = accs[1],...
							break;
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case 4 :
				System.out.println("��� �������Դϴ�.");
				System.out.print("���¹�ȣ  : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for(int i = 0 ; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
					// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc������
							acc = accs[i];
							// acc = accs[0], acc = accs[1],...
							break;
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);
				break;
			case 5 :
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false; break;
				//System.exit(0); //���α׷� ����
			}
		}while(run);
		//}
	}
}