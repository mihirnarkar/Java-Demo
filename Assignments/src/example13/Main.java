package example13;

//Vehicle class (assumed)
class Vehicle implements Cloneable {
 private String make;
 private String model;
 // Other properties and methods of the Vehicle class

 // Constructor
 public Vehicle(String make, String model) {
     this.make = make;
     this.model = model;
 }
 
 public String getMake() {
	 return this.make;
 }
 
 public String getModel() {
	 return this.model;
 }

 // Getter and setter methods for make and model

 // Override the clone() method
 @Override
 public Object clone() throws CloneNotSupportedException {
     return super.clone();
 }
}


public class Main {
    public static void main(String[] args) {
        try {
            Vehicle originalVehicle = new Vehicle("Toyota", "Camry");

            // Clone the originalVehicle
            Vehicle clonedVehicle = (Vehicle) originalVehicle.clone();

            // Verify the clonedVehicle
            System.out.println("Original Vehicle: " + originalVehicle);
            System.out.println("Cloned Vehicle: " + clonedVehicle);
            
            System.out.println(originalVehicle.getMake());
            System.out.println(clonedVehicle.getMake());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

