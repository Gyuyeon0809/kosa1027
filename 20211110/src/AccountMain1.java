import java.util.Scanner;

public class AccountMain1 {
	static Account [] accs = new Account[100];
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0; // �迭�� ���� ��ȣ ������ ���� ����
					  // �迭�� index�� 0�� ���� ����
	static boolean run = true;
	
	public static void main(String[] args) {
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
				
				accountPrint();
				
				System.out.println();
				break;
			case 3 :
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ  : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc = accoundFind(accountNo);
				
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
				
				acc = accoundFind(accountNo);
				
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
	public static Account accoundFind(String accountNo) {
		for(int i = 0 ; i < accs.length; i++) {
			if (accs[i] == null ) break;
			else {
				if(accs[i].getAccountNo().equals(accountNo)) {
					return accs[i];
				}
			}
		}
		return null;
	}
	public static void accountPrint() {
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i] == null) break;
			System.out.println(accs[i].getAccountNo()+"\t\t"
					+accs[i].getOwner()+"\t\t"
					+accs[i].getBalance());
		}
	}

}