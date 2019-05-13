package DI;


public class MakeCar {
	public static void main(String[] args) {

		FordWheel fordWheel = new FordWheel(90, "Ford's Tyre");
		Car genericCar = new Car(1, fordWheel);
		//System.out.print(figo);
		
		
		//MarutiWheel marutiWheel = new MarutiWheel(90, "Maruti's Tyre");
		//Car genericCar = new Car(1, marutiWheel);
		//System.out.print(genericCar);
	}

}
