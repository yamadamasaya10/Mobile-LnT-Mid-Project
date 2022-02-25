public class Car extends VehicleType {
	private int entertainment_system;

	public int getEntertainment_system() {
		return entertainment_system;
	}

	public void setEntertainment_system(int entertainment_system) {
		this.entertainment_system = entertainment_system;
	}
	
	public void turningOnEntertainment_system() {
		System.out.println("Turning on entertainment system...");
	}
}
