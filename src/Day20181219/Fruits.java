package Day20181219;

public class Fruits {
    static void cal() {
        int sum = 0;
        sum = sum + 10;
        System.out.println("합은 : " + sum);
    }
    public static void main(String[] args) {
        Apple ap = new Apple();
        System.out.println(ap.name);
        System.out.println(ap.color);
        System.out.println(ap.season);
        System.out.println(ap.shape);
        System.out.println(ap.price);
        cal();
    }
}
