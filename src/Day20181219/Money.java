package Day20181219;

public class Money {
    public static void main(String args[]) {
        // 동전 개수 구하기
        int money = 2680;
        int restMoney = money;
        int count;
        System.out.println("총 금액 : " + money + "원");

        count = restMoney / 500;
        System.out.println("500원 : " + count + "개");
        restMoney = restMoney - (500 * count);
        System.out.println("남은금액 : " + restMoney + "원");

        count = restMoney / 100;
        System.out.println("100원 : " + count + "개");
        restMoney = restMoney - (100 * count);
        System.out.println("남은금액 : " + restMoney + "원");

        count = restMoney / 50;
        System.out.println("50원 : " + count + "개");
        restMoney = restMoney - (50 * count);
        System.out.println("남은금액 : " + restMoney + "원");

        count = restMoney / 10;
        System.out.println("10원 : " + count + "개");
        restMoney = restMoney - (10 * count);
        System.out.println("남은금액 : " + restMoney + "원");
    }
}
