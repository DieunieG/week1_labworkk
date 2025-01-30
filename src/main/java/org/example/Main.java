package org.example;
public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;
    public Vehicle ( int numberOfWheels, String color, float engineSize, String fuelType ) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
public String getColor() {
        return color;
   }
public float getEngineSize() {
        return engineSize;
}
public String getFuelType() {
        return fuelType;
}
   public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        }
        public void setColor(String color) {
        this.color = color;
        }
        public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
        }
        public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
        }
        public void display() {
        System.out.println("Vehicle info");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine size: " + engineSize);
        System.out.println("Fuel type: " + fuelType);
        public static void main(String[] args){
            Vehicle car = new Vehicle(10,"pink", 6.1f, "regular");
            car.display();
        }
    }
    public class Car extends Vehicle{
    private String model;
    private String brand;
    }
}
