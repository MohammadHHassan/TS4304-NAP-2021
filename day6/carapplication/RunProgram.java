package day6.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheel1 = new Wheels();
		wheel1.brand = "Bridgestone";
		wheel1.size = 20;
		
		Wheels wheel2 = new Wheels();
		wheel2.brand = "LingLong";
		wheel2.size = 15;
		
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "GTR";
		car1.colour = "Red";
		car1.numberOfDoors = 2;
		car1.engineSize = 3.0;
		car1.numberOfRadio = 2;
		car1.wheels = wheel1;
		
		/*System.out.println(car1);
		System.out.println("Car 1 Brand = " + car1.brand);
		System.out.println("Car 1 Model = " + car1.model);*/
		
		Car car2 = new Car();
		car2.brand = "BMW";
		car2.model = "M2";
		car2.colour = "White";
		car2.numberOfDoors = 2;
		car2.engineSize = 6.5;
		car2.numberOfRadio = 1;
		car2.wheels = wheel2;
		
		/*System.out.println("\nCar 2:");
		System.out.println(car2);*/
		
		car1.pressAccelerator();
		car1.pressAccelerator();
		car1.pressAccelerator();
		System.out.println("Car 1 speed = " + car1.currentSpeed + " km/h");
		car1.pressBrake();
		System.out.println("Car 1 speed after braking = " + car1.currentSpeed + " km/h");
		
		System.out.println("Car 1 wheels: Brand = " + wheel1.brand + " Size = " + wheel1.size);
		System.out.println("Car 1 wheels: " + car1.wheels);
	}
}




