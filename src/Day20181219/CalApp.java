package Day20181219;

public class CalApp {
    static int plus(int x, int y) { //매개변수
        int result = x + y;
        return result; //return은 가장 마지막 줄
    }

    static int minus(int x, int y) { //매개변수
        int result = x - y;
        return result;
    }

    static int divid(int x, int y) { //매개변수
        int result = x / y;
        return result;
    }

    static int multiful(int x, int y) { //매개변수
        int result = x * y;
        return result;
    }
    //빼기, 나누기, 곱하기
    //minus, divid, multiful

    public static void main(String[] args) {
        int num = plus(30, 70); //인수 //값을 return받아서 num에 저장
        System.out.println(num); //return 받은 결과값
        minus(num, 30); //return받은 num값을 뺌
        divid(30, 70);
        multiful(30, 70);
    }
}
