package Day20181219;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.level);
        System.out.println(car.type);
        System.out.println(car.wheel + "인치");
        System.out.println(car.price + "달러");
    }
}
