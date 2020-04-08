// # 학생성적관리 프로그램[2단계] : 클래스 + 변수

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
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1) scores배열에 1~100점 사이의 정수를 5개 저장");
		for(int i=0;i<e.scores.length;i++)
		{
			System.out.println("성적을 입력하여라");
			int score = sc.nextInt();
			e.scores[i]=score;
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("문제2) 전교생의 총점과 평균 출력");
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<e.scores.length;i++)
		{
			sum += e.scores[i];
		}
		avg = sum/(double)e.scores.length;		//형변환
		System.out.println("총점("+sum+")");
		System.out.println("평균("+avg+")");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("문제3) 성적이 60점 이상이면 합격. 합격생 수 출력");
		int count=0;
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.scores[i]>=60)
			{
				count++;
			}
		}
		System.out.println("합격자 수:"+count+"명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.println("문제4) 인덱스를 입력받아 성적 출력");
		System.out.print("인덱스 입력:");
		int idx = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(i==idx)
			{
				System.out.println("성적:"+e.scores[i]);
			}
		}
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("문제5) 성적을 입력받아 인덱스 출력");
		System.out.print("성적 입력:");
		int score = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.scores[i]==score)
			{
				System.out.println("인덱스:"+i);
			}
		}
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("문제6) 학번을 입력받아 성적 출력");
		System.out.print("학번 입력:");
		int id = sc.nextInt();
		
		for(int i=0;i<e.scores.length;i++)
		{
			if(e.ids[i]==id)
			{
				System.out.println("성적:"+e.scores[i]);
			}
		}
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("문제7) 학번을 입력받아 성적 출력");
		int check = -1;
		System.out.print("학번 입력:");
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
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		else
		{
			System.out.println("성적:"+e.scores[check]);
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		System.out.println("문제8) 1등학생의 학번과 성적 출력");
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
		
		System.out.println(e.ids[check]+"번 ("+max+"점)");
	}
}