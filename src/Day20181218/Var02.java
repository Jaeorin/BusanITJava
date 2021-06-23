package Day20181218;

public class Var02 {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);

        String name = "니달리";
        System.out.println(name + "님에게 1000원을 입금하였습니다.");
        System.out.println(name + "님이 1000원을 입금받았습니다.");

        // 묵시적 형변환
        // 서로 다른 형식의 자료형을 연산할 때 데이터 크기가 작은 형식의 변수를 큰 형식으로 형변환(Type Casting)하여 연산한다
        // byte -> short 또는 char -> int -> long -> float -> double
        int i = 1;
        System.out.println(i + 10); // int + int
        System.out.println(i + "10"); // int + String -> (String)int + String
        System.out.println(i + 9.5); // int + float
        // 반대로 변수 왼쪽에 소괄호()로 연산할 타입을 지정할 경우를 명시적 형변환이라 한다

        // 연산자
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(6 / 4); // double 로 타입이 바뀜
        System.out.println(5 + 3.0);
        System.out.println(5 % 3);

        // boolean
        System.out.println(1 == 1);
        System.out.println(1 == 2);
        System.out.println(1 > 99);
        System.out.println(1 < 99);
        System.out.println(1 <= 1);
        System.out.println(1 >= 1);
        System.out.println(1 != 99); // ! = 부정표현
        System.out.println(!true);
    }
}
