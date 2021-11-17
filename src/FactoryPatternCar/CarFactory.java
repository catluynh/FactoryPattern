package FactoryPatternCar;

public class CarFactory {
    public static  Car getCar(String type, String name, String price, String configuration, String producer){
        if("honda".equalsIgnoreCase(type)) return new Honda(name, price, configuration, producer);
        else if("nexus".equalsIgnoreCase(type)) return new Nexus(name, price, configuration, producer);
        else if("toyota".equalsIgnoreCase(type)) return new Toyota(name, price, configuration, producer);
        return null;
    }
}
