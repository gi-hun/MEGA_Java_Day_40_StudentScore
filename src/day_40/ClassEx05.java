/*
 * # �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + ����
 * 1. �й��� �Է��ϸ�, �ش� �л��� ������ ��µȴ�.
 * 2. ��, ���� �й� �Է¿� ���� ���ܻ�Ȳ�� �ݵ�� ó���ؾ� �Ѵ�.
 * 3. 1��� �õ� �л��� ������ Ȯ���� �� �ִ�.
 */

package day_40;

import java.util.Scanner;

class Ex05
{
	String name = "";
	
	int[] arId = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
}

public class ClassEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex05 mega = new Ex05();
		mega.name = "�ް����͵�";
		
		while(true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				int sum = 0;
				double avg = 0.0;
				System.out.println("������ ����");
				for(int i=0;i<mega.arId.length;i++)
				{
					System.out.print(mega.arScore[i]+ " ");
					sum += mega.arScore[i];
				}
				System.out.println();
				System.out.println("�л� ���� ����:"+sum);
				avg = sum/(double)mega.arScore.length;
				System.out.println("�л� ���� ���"+avg);
			}
			else if(choice == 2) {
				int max = mega.arScore[0];
				int idx = -1;
				for(int i=0;i<mega.arId.length;i++)
				{
					if(max<mega.arScore[i])
					{
						max = mega.arScore[i];
						idx = i;
					}
				}
				System.out.println("1�� �л� ����: "+max);
				System.out.println("1�� �л� �й�: "+mega.arId[idx]);
			}
			else if(choice == 3) {
				int min = mega.arScore[0];
				int idx = -1;
				for(int i=0;i<mega.arId.length;i++)
				{
					if(min>mega.arScore[i])
					{
						min = mega.arScore[i];
						idx = i;
					}
				}
				System.out.println("�õ� �л� ����: "+min);
				System.out.println("�õ� �л� �й�: "+mega.arId[idx]);
			}
			else if(choice == 4) {
				System.out.print("�й��� �Է��ϼ���:");
				int num = sc.nextInt();
				int check = -1;
				
				for(int i=0;i<mega.arId.length;i++)
				{
					if(mega.arId[i]==num)
					{
						check = i;
					}
				}
				
				if(check == -1)
				{
					System.out.println("�ش� �й��� �����ϴ�.");
				}
				else
				{
					System.out.println("�й�: " + mega.arId[check]);
					System.out.println("����: " + mega.arScore[check]);
				}
				
			}
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	

	}
}
