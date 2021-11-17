package FactoryPatternCar;

public class Honda extends Car{
    private String name;
    private String price;
    private String configuration;
    private String producer;

    public Honda(String name, String price, String configuration, String producer) {
        this.name = name;
        this.price = price;
        this.configuration = configuration;
        this.producer = producer;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getConfiguration() {
        return this.configuration;
    }

    @Override
    public String getProducer() {
        return this.producer;
    }
}
