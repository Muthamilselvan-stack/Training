public class Car {
    private String brand;
    public Car() {
        this.brand = "unknown";
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Brand: " + myCar.getBrand()); 
        myCar.setBrand("Ford");
        System.out.println("Brand: " + myCar.getBrand()); 
    }
}
