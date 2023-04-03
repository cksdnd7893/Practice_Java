import java.util.*;

public class Main {
    public static void main(String[] args) {
        int money = 0;

        while(true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("자판기입니다. 돈을 넣고 원하시는 품목을 번호를 입력하십시오.");
            System.out.println("1. 콜라(1,200원)");
            System.out.println("2. 사이다(1,200원)");
            System.out.println("3. 환타(1,100원)");
            System.out.println("4. 밀키스(1,100원)");
            System.out.println("금액 투입은 +, 거스름을 받으시려면 -를 입력하세요. 현재잔액 " + money + "원");
            System.out.println("--------------------------------------------------------");
            System.out.print("원하시는 작업을 입력하세요 >> ");

            Scanner in = new Scanner(System.in);
            String req = in.nextLine();

            if(req.equals("+")) {
                System.out.print("얼마를 투입하시겠습니까? >> ");

                int put_money = in.nextInt();
                money += put_money;
                System.out.print("\n\n");
            }
            else if(req.equals("-")) {
                System.out.println(money + "원이 거슬러집니다. 이용해주셔서 감사합니다.");
                break;
            }
            else if(req.equals("1")) {
                if(money > 1200) {
                    System.out.println("콜라가 나옵니다. 상품을 수령해주세요.\n\n");
                    money -= 1200;
                }
                else {
                    System.out.println("잔액이 부족합니다. 돈을 더 투입하십시오.\n\n");
                    continue;
                }
            }
            else if(req.equals("2")) {
                if(money > 1200) {
                    System.out.println("사이다가 나옵니다. 상품을 수령해주세요.\n\n");
                    money -= 1200;
                }
                else {
                    System.out.println("잔액이 부족합니다. 돈을 더 투입하십시오.\n\n");
                    continue;
                }
            }
            else if(req.equals("3")) {
                if(money > 1100) {
                    System.out.println("환타가 나옵니다. 상품을 수령해주세요.\n\n");
                    money -= 1100;
                }
                else {
                    System.out.println("잔액이 부족합니다. 돈을 더 투입하십시오.\n\n");
                    continue;
                }
            }
            else if(req.equals("4")) {
                if(money > 1100) {
                    System.out.println("밀키스가 나옵니다. 상품을 수령해주세요.\n\n");
                    money -= 1100;
                }
                else {
                    System.out.println("잔액이 부족합니다. 돈을 더 투입하십시오.\n\n");
                    continue;
                }
            }
            else {
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }
}