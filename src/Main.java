import driver.CategoryB;
import driver.CategoryC;
import driver.CategoryD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        boolean success = Data.validate("pogoro","123456123","123456123");

        System.out.println(success);

        //Задание 2
        System.out.println("Задание 2");

        Car car = new Car("Audi","A8 50 L TDI quattro",3.0);
        Car car1 = new Car("BMW","Z8",3.0);
        Car car2 = new Car("Kia","Sportage 4",2.4);
        Car car3 = new Car("Hyundai","Avante",1.6);

        Bus bus = new Bus("Икарус","350",4.0);
        Bus bus1 = new Bus("Iveco","320",5.0);
        Bus bus2 = new Bus("Fiat","399",3.5);
        Bus bus3 = new Bus("Hyundai","Н350",4.8);

        Trucks trucks = new Trucks ("Mercedes-Benz","B-901" , 6.6);
        Trucks trucks1 = new Trucks("Nissan", "399", 6.2);
        Trucks trucks2 = new Trucks("Chevrolet","M700", 7.5);
        Trucks trucks3 = new Trucks("Scania","T540", 8.7);

        CategoryB <Car> driverB = new CategoryB<>("Сергей", true, 2);
        CategoryC <Trucks> driverC = new CategoryC<>("Григорий", true, 4);
        CategoryD <Bus> driverD = new CategoryD<>("Станислав", true, 1);

        driverB.race(car2);
        driverC.race(trucks3);
        driverD.race(bus3);

        service(car,car1,car2,car3,
                trucks,trucks1,trucks2,trucks3,
                bus,bus1,bus2,bus3);
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()){
                throw new RuntimeException("Автомобиль: " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}