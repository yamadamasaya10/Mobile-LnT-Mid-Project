import java.util.*;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<VehicleType> vehicle = new ArrayList<>();
	String brand, name, license_number, vehicle_type;
	int top_speed, gasCap, wheel;
	Car newCar = new Car();
	int entertainment_system;
	Motorcycle newMotorcycle = new Motorcycle();
	int helm;
	int index = 0;
	
	void CarList() {
		Car newCar = new Car();
		newCar.setChooseVehicle("Car");
		
		boolean isBrand = false;
		do {
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
			isBrand = brand.length() >= 5;
			if (!isBrand) {
				System.out.println("Brand length must be atleast 5 characters!");
			}
		} while (!isBrand);
		newCar.setBrand(brand);
		
		boolean isName = false;
		do {
			System.out.print("Input name [>= 5]: ");
			name = scan.nextLine();
			isName = name.length() >= 5;
			if (!isName) {
				System.out.println("Name length must be atleast 5 characters!");
			}
		} while (!isName);
		newCar.setName(name);
		
		boolean isLicense_number = false;
		do {
			
			System.out.print("Input license: ");
			license_number = scan.nextLine();
			boolean isUpper = license_number.equals(license_number.toUpperCase());
			boolean isRight = license_number.matches("[A-Za-z] [0-9]{1,4} [A-Za-z]{1,3}");
			
			if (!isUpper || !isRight) {
				System.out.println("License number must be starting with capital letters A-Z, "
						+ "then followed by a space, a minimum of 1 and a maximum of 4 digit numbers 0-9, "
						+ "then followed by a space, and ending with a minimum of 1 and a maximum of 3 digits of capital letters A-Z");
			}
			else {
				isLicense_number = true;
			}
		} while (!isLicense_number);
		newCar.setLicense_number(license_number);
		
		boolean isTop_speed = false;
		do {
			try {
				System.out.print("Input top speed [100-250]: ");
				top_speed = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isTop_speed = top_speed >= 100 && top_speed <= 250;
			if (!isTop_speed) {
				System.out.println("Top speed must be in between 100 and 250!");
			}
		} while (!isTop_speed);
		newCar.setTop_speed(top_speed);
		
		boolean isGasCap = false;
		do {
			try {
				System.out.print("Input gas capacity [30-60]: ");
				gasCap = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isGasCap = gasCap >= 30 && gasCap <= 60;
			if (!isGasCap) {
				System.out.println("Gas capacity must be in between 30 and 60!");
			}
		} while (!isGasCap);
		newCar.setGasCap(gasCap);
		
		boolean isWheel = false;
		do {
			try {
				System.out.print("Input wheels [4-6]: ");
				wheel = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isWheel = wheel >= 4 && wheel <= 6;
			if (!isWheel) {
				System.out.println("Wheels must be in between 4 and 6!");
			}
		} while (!isWheel);
		newCar.setWheel(wheel);
		
		boolean isVehicle_type = false;
		do {
			System.out.print("Input type [SUV/Supercar/Minivan]: ");
			vehicle_type = scan.nextLine();
			isVehicle_type = 
					vehicle_type.equalsIgnoreCase("SUV") || 
					vehicle_type.equalsIgnoreCase("Supercar") || 
					vehicle_type.equalsIgnoreCase("Minivan");
			if (!isVehicle_type) {
				System.out.println("Car type must be either SUV, Supercar, or Minivan!");
			}
		} while (!isVehicle_type);
		newCar.setVehicle_type(vehicle_type);
		
		boolean isEntertainment_system = false;
		do {
			try {
				System.out.print("Input entertainment system amount [Minimal amount is 1]: ");
				entertainment_system = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isEntertainment_system = entertainment_system >= 1;
			if (!isEntertainment_system) {
				System.out.println("Entertainment system's amount must be atleast 1!");
			}
		} while (!isEntertainment_system);
		newCar.setEntertainment_system(entertainment_system);
		
		vehicle.add(newCar);
		index++;
	}
	
	void MotorcycleList() {
		Motorcycle newMotorcycle = new Motorcycle();
		newMotorcycle.setChooseVehicle("Motorcycle");
		
		boolean isBrand = false;
		do {
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
			isBrand = brand.length() >= 5;
			if (!isBrand) {
				System.out.println("Brand length must be atleast 5 characters!");
			}
		} while (!isBrand);
		newMotorcycle.setBrand(brand);
		
		boolean isName = false;
		do {
			System.out.print("Input name [>= 5]: ");
			name = scan.nextLine();
			isName = name.length() >= 5;
			if (!isName) {
				System.out.println("Name length must be atleast 5 characters!");
			}
		} while (!isName);
		newMotorcycle.setName(name);
		
		boolean isLicense_number = false;
		do {
			
			System.out.print("Input license: ");
			license_number = scan.nextLine();
			boolean isUpper = license_number.equals(license_number.toUpperCase());
			boolean isRight = license_number.matches("[A-Za-z] [0-9]{1,4} [A-Za-z]{1,3}");
			
			if (!isUpper || !isRight) {
				System.out.println("License number must be starting with capital letters A-Z, "
						+ "then followed by a space, a minimum of 1 and a maximum of 4 digit numbers 0-9, "
						+ "then followed by a space, and ending with a minimum of 1 and a maximum of 3 digits of capital letters A-Z");
			}
			else {
				isLicense_number = true;
			}
		} while (!isLicense_number);
		newMotorcycle.setLicense_number(license_number);
		
		boolean isTop_speed = false;
		do {
			try {
				System.out.print("Input top speed [100-250]: ");
				top_speed = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isTop_speed = top_speed >= 100 && top_speed <= 250;
			if (!isTop_speed) {
				System.out.println("Top speed must be in between 100 and 250!");
			}
		} while (!isTop_speed);
		newMotorcycle.setTop_speed(top_speed);
		
		boolean isGasCap = false;
		do {
			try {
				System.out.print("Input gas capacity [30-60]: ");
				gasCap = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isGasCap = gasCap >= 30 && gasCap <= 60;
			if (!isGasCap) {
				System.out.println("Gas capacity must be in between 30 and 60!");
			}
		} while (!isGasCap);
		newMotorcycle.setGasCap(gasCap);
		
		boolean isWheel = false;
		do {
			try {
				System.out.print("Input wheels [2-3]: ");
				wheel = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isWheel = wheel > 1 && wheel < 4;
			if (!isWheel) {
				System.out.println("Wheels must be either 2 or 3!");
			}
		} while (!isWheel);
		newMotorcycle.setWheel(wheel);
		
		boolean isVehicle_type = false;
		do {
			System.out.print("Input type [Sport/Dirt Bike/Scooter]: ");
			vehicle_type = scan.nextLine();
			isVehicle_type = 
					vehicle_type.equalsIgnoreCase("Sport") || 
					vehicle_type.equalsIgnoreCase("Dirt Bike") || 
					vehicle_type.equalsIgnoreCase("Scooter");
			if (!isVehicle_type) {
				System.out.println("Motorcycle type must be either Sport, Dirt Bike, or Scooter!");
			}
		} while (!isVehicle_type);
		newMotorcycle.setVehicle_type(vehicle_type);
		
		boolean isHelm = false;
		do {
			try {
				System.out.print("Input helm amount [Minimal amount is 1]: ");
				helm = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			isHelm = helm >= 1;
			if (!isHelm) {
				System.out.println("Helm amount must be atleast 1!");
			}
		} while (!isHelm);
		newMotorcycle.setHelm(helm);
		
		vehicle.add(newMotorcycle);
		index++;
	}
	
	void view() {
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|No   |Type           |Name           |");
		System.out.println("|-----|---------------|---------------|");
		for (VehicleType Vehicle: vehicle) {
			System.out.println("| "+ (vehicle.indexOf(Vehicle) + 1) + "   |" + Vehicle.getChooseVehicle() +    "         |" + Vehicle.getName() + "       |");
			System.out.println("|-----|---------------|---------------|");
		}
		
		try {
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: "); index = scan.nextInt(); scan.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Input must be a number!");
			scan.next();
		}
		
		if (index == 0) {
			return;
		}
		else if (index <= vehicle.size()) {
			viewList (index - 1);
		}
		else if (index > vehicle.size()) {
			System.out.println("\nVehicle number input must match the list!");
		}
	}
	
	void viewList(int index) {
		System.out.println("Brand: " + vehicle.get(index).getBrand());
		System.out.println("Name: " + vehicle.get(index).getName());
		System.out.println("License Plate: " + vehicle.get(index).getLicense_number());
		System.out.println("Type: " + vehicle.get(index).getVehicle_type());
		System.out.println("Gas Capacity: " + vehicle.get(index).getGasCap());
		System.out.println("Top Speed: " + vehicle.get(index).getTop_speed());
		System.out.println("Wheels: " + vehicle.get(index).getWheel());
		
		if (vehicle.get(index).getChooseVehicle().equalsIgnoreCase("Car")) {
			System.out.println("Entertainment System: " + vehicle.get(index).getEntertainment_system());
			newCar.turningOnEntertainment_system();
			if (vehicle.get(index).getVehicle_type().equalsIgnoreCase("Supercar")) {
				System.out.println("Boosting!");
			}
		}
		
		else if (vehicle.get(index).getChooseVehicle().equalsIgnoreCase("Motorcycle")) {
			System.out.println("Helm: " + vehicle.get(index).getHelm());
			System.out.println("<" + vehicle.get(index).getName() + ">" + " is standing!");
			int price = 0;
			try {
				System.out.print("Input helm's price: "); price = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number!");
				scan.next();
			}
			System.out.println("Price : <" + price + ">");
		}
	}
	
	void VehicleList() {
		boolean isVL = false;
		String VL;
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			VL = scan.nextLine();
			if (VL.equalsIgnoreCase("Car")) {
				isVL = true;
				CarList();
			} else if (VL.equalsIgnoreCase("Motorcycle")) {
				isVL = true;
				MotorcycleList();
			} else
				System.out.println("Input must be either Car or Motorcycle!");
		} while (!isVL);
	}
	
	public Main() {
		int option;
		do {
			System.out.println("Vehicle List PT Musang");
			System.out.println("(1) Insert New Data");
			System.out.println("(2) View Vehicle List");
			System.out.println("(3) Exit");
			System.out.print("Choose the option: ");
			option = scan.nextInt(); scan.nextLine();
			switch (option) {
				case 1:
					VehicleList();
					System.out.println("Press Enter to return..."); scan.nextLine();
					break;
				case 2:
					view();
					System.out.println("Press Enter to return..."); scan.nextLine();
					break;
				case 3:
					System.out.println("Exiting program...");
					break;
				default:
		            System.out.println("Choice must be a value between 1 and 3!");
			}
		} while (option != 3);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
