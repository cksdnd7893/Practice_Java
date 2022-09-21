import java.util.*;

public class scannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요_>> ");
		String inputInt = in.nextLine();
		
		System.out.println("당신이 입력한 숫자는 " + inputInt + "입니다.");
	}

}
