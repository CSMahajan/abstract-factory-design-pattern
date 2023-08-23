package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.*;
import AbstractFactoryPattern.AbstractFactory.AbstractCarFactory;

public class LuxuryCarFactory implements AbstractCarFactory {

    @Override
    public Car getInstance(int price) {
        if (price <= 2000000) {
            return new Mercedes();
        } else return new BMW();
    }
}
