import java.util.*;

public class Main {
    public static void main(String[] args) {
        int money = 0;

        Product p[] = new Product[4];

        p[0] = new Product("콜라", 1200, 3);
        p[1] = new Product("사이다", 1200, 3);
        p[2] = new Product("환타", 1100, 2);
        p[3] = new Product("밀키스", 1100, 2);

        while(true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("자판기입니다. 돈을 넣고 원하시는 품목을 번호를 입력하십시오.");
            for(int i = 0; i < p.length; i++) {
                System.out.println( (i+1) + ". " + p[i].p_name + "(" + p[i].p_price + "원) 재고:" + p[i].p_stock);
            }
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
            else if((Integer.parseInt(req) > 0) && (Integer.parseInt(req) < (p.length + 1))) {
                if (money > p[Integer.parseInt(req) - 1].p_price) {
                    if(p[Integer.parseInt(req) - 1].p_stock >= 1) {
                        System.out.println(p[Integer.parseInt(req) - 1].p_name + "가 나옵니다. 상품을 수령해주세요.\n\n");
                        money -= p[Integer.parseInt(req) - 1].p_price;
                        p[Integer.parseInt(req) - 1].p_stock -= 1;
                    }
                    else {
                        System.out.println("해당 제품은 재고가 부족합니다.");
                        continue;
                    }
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