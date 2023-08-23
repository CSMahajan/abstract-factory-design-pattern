package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.AbstractFactory.AbstractCarFactory;
import AbstractFactoryPattern.Car;
import AbstractFactoryPattern.Hyundai;
import AbstractFactoryPattern.MarutiSuzuki;

public class EconomyCarFactory implements AbstractCarFactory {

    @Override
    public Car getInstance(int price) {
        if (price <= 300000) {
            return new MarutiSuzuki();
        } else return new Hyundai();
    }
}
