import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        DBManager dbm = new DBManager();
        Scanner in = new Scanner(System.in);
        System.out.println("1. 테이블 생성");
        System.out.println("2. DB 입력");
        System.out.print("원하는 작업을 입력하세요 >> ");

        int num = in.nextInt();
        if (num == 1) {
            dbm.DBTableCreate();
        } else if (num == 2) {
            System.out.print("\n\nID를 입력하세요 >> ");
            int id = in.nextInt();
            in.nextLine();
            System.out.print("이름을 입력하세요 >> ");
            String name = in.nextLine();
            dbm.DBInput(id, name);
        }

    }
}

