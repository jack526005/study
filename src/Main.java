import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();//创建一辆新车
        int t;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            t = scanner.nextInt();
            switch (t) {
                case 0:
                    car.start();
                    break;
                case 1:
                    car.changeGear(1);
                    break;
                case 2:
                    car.changeGear(2);
                    break;
                case 3:
                    car.changeGear(3);
                    break;
                case 4:
                    car.changeGear(4);
                    break;
                case 5:
                    car.upspeed();
                    break;
                case 6:
                    car.downspeed();
                    break;
                case 7:
                    car.close();
                    break;
            }
            System.out.println("挡位: " + car.gear + " 速度: " + car.speed);
        }
    }
}