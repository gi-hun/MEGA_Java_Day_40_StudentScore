/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
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
		mega.name = "메가스터디";
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				int sum = 0;
				double avg = 0.0;
				System.out.println("전교생 성적");
				for(int i=0;i<mega.arId.length;i++)
				{
					System.out.print(mega.arScore[i]+ " ");
					sum += mega.arScore[i];
				}
				System.out.println();
				System.out.println("학생 성적 총합:"+sum);
				avg = sum/(double)mega.arScore.length;
				System.out.println("학생 성적 평균"+avg);
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
				System.out.println("1등 학생 성적: "+max);
				System.out.println("1등 학생 학번: "+mega.arId[idx]);
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
				System.out.println("꼴등 학생 성적: "+min);
				System.out.println("꼴등 학생 학번: "+mega.arId[idx]);
			}
			else if(choice == 4) {
				System.out.print("학번을 입력하세요:");
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
					System.out.println("해당 학번은 없습니다.");
				}
				else
				{
					System.out.println("학번: " + mega.arId[check]);
					System.out.println("성적: " + mega.arScore[check]);
				}
				
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	

	}
}
