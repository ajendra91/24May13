package DI;


public class Car {
	private int carId;
	private FordWheel FordWheel;

	public Car() {
	}

	public Car(int carId, FordWheel fordWheel) {
		this.carId = carId;
		FordWheel = fordWheel;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public FordWheel getFordWheel() {
		return FordWheel;
	}

	public void setFordWheel(FordWheel fordWheel) {
		FordWheel = fordWheel;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", FordWheel=" + FordWheel + "]";
	}

}
