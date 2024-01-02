package Criacionais.Prototype;

public class Main {

    public static void main(String[] args) {
        Car originalCar = new Car();
        originalCar.setBrand("fiat");
        originalCar.setColor("blue");
        originalCar.setModel("suv");
        originalCar.setTopSpeed(140);
        originalCar.displayInfo();


        Car copy = originalCar.clone();
        copy.displayInfo();
        System.out.println(originalCar==copy);

    }

    
}
