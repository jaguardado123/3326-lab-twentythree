package vehicles;

public class Truck extends Car {
	
	@Override
	public void aboutCar() {
		System.out.println("This is a domestic car.");
	}
	@Override
	public void aboutVehicle() {
		System.out.println("This is a gasoline only powered vehicle.");
	}
	@Override
	public void aboutEngine() {
		System.out.println("This is a 6-cylinder engine.");
	}
}
