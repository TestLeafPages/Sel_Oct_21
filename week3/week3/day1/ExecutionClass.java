package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.accelerate();
		b.driveVehicle();
		b.applyBrake();
		b.closeDoor();
		b.enableAirbag();
		b.fillFuel();
		b.shiftGear();
		System.out.println(" Car wheel cunt: " + b.wheelCar);
		
		
		Audi a = new Audi();
		a.accelerate();
		a.shiftGear();
		a.closeDoor();
		a.applyBrake();
		a.enableAirbag();
		a.fillFuel();
		a.driveVehicle();
		
		System.out.println(" Audi Car wheel cunt: " + a.wheelCar);
		
		
		Bajaj autoObj = new Bajaj();
		autoObj.accelerate();
		System.out.println(" Audi Car wheel cunt: " + autoObj.wheelAuto);
		
		
		
		
		
		
		
		
		

	}

}
