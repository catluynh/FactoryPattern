package FactoryPatternCar;

public class TestFactory {
    public static void main(String[] args) {
        Car honda = CarFactory.getCar("honda", "honda civic", "300k usd", "2.0 lit", "honda");
        Car nexus = CarFactory.getCar("nexus", "nexus", "200k usd", "2.0 lit", "nexus");
        Car toyota = CarFactory.getCar("toyota", "toyota", "250k usd", "2.0 lit", "toyota");

        System.out.println("Factory Honda Config:"+honda);
        System.out.println("Factory Nexus Config:"+nexus);
        System.out.println("Factory Toyota Config:"+toyota);
    }
}
