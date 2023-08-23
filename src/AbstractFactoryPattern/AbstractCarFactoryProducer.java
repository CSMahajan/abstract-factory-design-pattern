package AbstractFactoryPattern;

import AbstractFactoryPattern.AbstractFactory.AbstractCarFactory;
import AbstractFactoryPattern.Factory.EconomyCarFactory;
import AbstractFactoryPattern.Factory.LuxuryCarFactory;

public class AbstractCarFactoryProducer {
    public AbstractCarFactory getInstance(String carPriceSegment) {
        switch (carPriceSegment) {
            case "Economy":
                return new EconomyCarFactory();
            case "Luxury":
            case "Premium":
                return new LuxuryCarFactory();
        }
        return null;
    }
}
