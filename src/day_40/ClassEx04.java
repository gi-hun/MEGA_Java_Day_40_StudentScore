// # �л��������� ���α׷�[2�ܰ�] : Ŭ���� + ����

package day_40;

import java.util.Scanner;

class Ex04
{
	int[] ids = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
}

public class ClassEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex04 e = new Ex04();
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		System.out.println("����1) scores�迭�� 1~100�� ������ ������ 5�� ����");
		for(int i=0;i<e.scores.length;i++)
		{
			System.out.println("������ �Է��Ͽ���");
			int score = sc.nextInt();
			e.scores[i]=score;
		}
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		System.out.println("����2) �������� ������ ��� ���");
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<e.scores.length;i++)
		{
			sum += e.scores[i];
		}
		avg = sum/(double)e.scores.length;		//����ȯ
		System.out.println("����("+sum+")");
		System.out.println("���("+avg+")");
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���");
		int count=0;
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.scores[i]>=60)
			{
				count++;
			}
		}
		System.out.println("�հ��� ��:"+count+"��");
		
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1	���� : 11��
		System.out.println("����4) �ε����� �Է¹޾� ���� ���");
		System.out.print("�ε��� �Է�:");
		int idx = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(i==idx)
			{
				System.out.println("����:"+e.scores[i]);
			}
		}
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11		�ε��� : 1
		System.out.println("����5) ������ �Է¹޾� �ε��� ���");
		System.out.print("���� �Է�:");
		int score = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.scores[i]==score)
			{
				System.out.println("�ε���:"+i);
			}
		}
		
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003	���� : 45��
		System.out.println("����6) �й��� �Է¹޾� ���� ���");
		System.out.print("�й� �Է�:");
		int id = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.ids[i]==id)
			{
				System.out.println("����:"+e.scores[i]);
			}
		}
		// ����7) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.println("����7) �й��� �Է¹޾� ���� ���");
		int check = -1;
		System.out.print("�й� �Է�:");
		int num = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.ids[i]==num)
			{
				check = i;
			}
		}
		
		if(check == -1)
		{
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}
		else
		{
			System.out.println("����:"+e.scores[check]);
		}
		
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		System.out.println("����8) 1���л��� �й��� ���� ���");
		int max = e.scores[0];
		check = -1;
		for(int i=0;i<e.scores.length;i++)
		{
			if(max<e.scores[i])
			{
				max = e.scores[i];
				check = i;
			}
		}
		
		System.out.println(e.ids[check]+"�� ("+max+"��)");
	}
}