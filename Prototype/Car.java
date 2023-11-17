package Prototype;

public class Car implements Prototype {

    private String brand;
    private String model;
    private String color;
    private int topspeed;

    public Car(){};
    
    public Car(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.topspeed = car.topspeed;
    };
   
    @Override
   public Car clone()  {
        
        return new Car(this);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topspeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topspeed = topSpeed;
    }

    // Método para exibir informações do carro
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Top Speed: " + topspeed);


    
}

}