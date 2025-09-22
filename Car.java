
class Car {
    String color;
    String model;

    void drive() {
        System.out.println("The car is driving.");
    }

    void displayDetails() {
        System.out.println("Car color: " + color + ", Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car();    // create object
        myCar.color = "Red";      // set attributes
        myCar.model = "Sedan";

        myCar.drive();            // call drive method
        myCar.displayDetails();   // show car details
    }
}


