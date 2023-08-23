package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Car;

public interface AbstractCarFactory {
    Car getInstance(int price);
}
