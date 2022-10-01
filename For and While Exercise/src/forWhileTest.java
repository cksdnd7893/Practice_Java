import java.util.*;

public class forWhileTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("1부터 n까지의 합을 구하는 프로그램입니다.\nn의 값을 입력하세요 >> ");
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}

