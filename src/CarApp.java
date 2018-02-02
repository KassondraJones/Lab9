import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carArr = new ArrayList<Car>();
		int numCars;
		String carMake;
		String carModel;
		int carYear;
		double carPrice;

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();
		System.out.print("How many cars are you entering? ");
		numCars = scan.nextInt();
		scan.nextLine();

		// For loop to input and store car data from user
		for (int i = 1; i <= numCars; i++) {

			System.out.println("Enter car #" + i + " Make: ");
			carMake = scan.nextLine();

			System.out.println("Enter car #" + i + " Model: ");
			carModel = scan.nextLine();

			System.out.println("Enter car #" + i + " Year: ");
			carYear = scan.nextInt();

			System.out.println("Enter car #" + i + " Price: ");
			carPrice = scan.nextDouble();
			scan.nextLine();

			Car car = new Car(carMake, carModel, carYear, carPrice);

			// car.setCarMake(carMake);
			carArr.add(car);
		}
		
		// System.out.println(carArr);
		// loop

		System.out.println("Current Inventory:");
		
		for (int i = 0; i < carArr.size(); i++) {
			System.out.println(carArr.get(i).toString());
		}

		
		
	}

}
