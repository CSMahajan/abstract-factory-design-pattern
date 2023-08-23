import AbstractFactoryPattern.AbstractCarFactoryProducer;
import AbstractFactoryPattern.AbstractFactory.AbstractCarFactory;
import AbstractFactoryPattern.Car;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractCarFactoryProducer acfp = new AbstractCarFactoryProducer();
        AbstractCarFactory carFactory = acfp.getInstance("Premium");
        Car car = carFactory.getInstance(1100000);
        System.out.println(car.getTopSpeed());
    }
}