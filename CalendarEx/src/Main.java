import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //연도, 월, 일을 입력하면 해당 요일을 출력해주는 프로그램 작성
        Scanner in = new Scanner(System.in);

        System.out.print("연도를 입력하세요 >> ");
        int year = in.nextInt();

        System.out.print("월을 입력하세요 >> ");
        int month = in.nextInt();

        System.out.print("일을 입력하세요 >> ");
        int day = in.nextInt();

        Calendar c = new Calendar(year, month, day);
        System.out.println("해당 날짜의 요일은 " + c.d_o_week() + "입니다!");
    }
}