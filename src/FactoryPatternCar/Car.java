package FactoryPatternCar;

public abstract class Car {
    public abstract String getName();
    public abstract String getPrice();
    public abstract String getConfiguration();
    public abstract String getProducer();

    @Override
    public String toString() {
        return "Name= "+ this.getName() + ", Price= " + this.getPrice()+ ", Configuration= "+ this.getConfiguration()+ ", Producer= "+ this.getProducer() ;
    }
}
