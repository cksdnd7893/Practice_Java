package whileTest;
import java.util.*;

public class whileTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("1부터 n까지의 합을 구하는 프로그램입니다. \nn의 값을 입력하세요 >> ");
		int n = in.nextInt();
		
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
	}

}
