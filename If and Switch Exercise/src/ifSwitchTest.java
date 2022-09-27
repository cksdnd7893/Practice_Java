import java.util.*;

public class ifSwitchTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float score = 0;
		
		System.out.print("당신의 점수를 입력하세요 >> ");
		score = in.nextFloat();
		
		//if문을 사용해 60점 이상일시 합격을 출력하자
		if(score >= 60) {
			System.out.println("합격입니다.");
			//중첩 if문을 사용하여 등급을 표시하자
			if(score >= 90) {
				System.out.println("등급은 A");
			}
			else if(score >= 70) {
				System.out.println("등급은 B");
			}
			else {
				System.out.println("등급은 C");
			}
		}
		//if-else 문을 이용해 출력물을 달리하자
		else if(score >= 50) {
			System.out.println("불합격입니다. 조금만 더 공부하면 붙을 수 있겠네요");
		}
		else {
			System.out.println("불합격입니다. 조금 더 분발하셔야겠네요");
		}
	}
}

