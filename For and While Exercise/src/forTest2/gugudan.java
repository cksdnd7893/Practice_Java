package forTest2;

public class gugudan {
	public static void main(String[] args) {
		System.out.println("2단부터 9단까지 출력하겠습니다");
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.print("\n");
		}
	}
}

