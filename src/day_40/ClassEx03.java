//# �л��������� ���α׷�[1�ܰ�] : Ŭ���� + ����

package day_40;

class Ex03
{
	int[] arr = {87,100,11,72,92};
}

public class ClassEx03 {
	public static void main(String[] args) {
		Ex03 e = new Ex03();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int sum = 0;
		for(int i=0;i<e.arr.length;i++)
		{
			sum += e.arr[i];
		}
		System.out.println("�л� ���� ����:"+sum);
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		sum = 0;
		for(int i=0;i<e.arr.length;i++)
		{
			if(e.arr[i]%4==0)
			{
				sum += e.arr[i];
			}
		}
		System.out.println("4�� ��� ���� ����:"+sum);
		
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int count = 0;
		for(int i=0;i<e.arr.length;i++)
		{
			if(e.arr[i]%4==0)
			{
				count++;
			}
		}
		System.out.println("4�� ��� ���� ����:"+count);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		count = 0;
		for(int i=0;i<e.arr.length;i++)
		{
			if(e.arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("¦�� ����:"+count);

	}
}
