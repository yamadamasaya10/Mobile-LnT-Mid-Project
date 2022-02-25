public abstract class VehicleType {
	private String brand, name, license_number, vehicle_type, chooseVehicle;
	private int top_speed, gasCap, wheel, entertainment_system, helm;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getChooseVehicle() {
		return chooseVehicle;
	}
	public void setChooseVehicle(String chooseVehicle) {
		this.chooseVehicle = chooseVehicle;
	}
	public int getTop_speed() {
		return top_speed;
	}
	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}
	public int getGasCap() {
		return gasCap;
	}
	public void setGasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getEntertainment_system() {
		return entertainment_system;
	}
	public void setEntertainment_system(int entertainment_system) {
		this.entertainment_system = entertainment_system;
	}
	public int getHelm() {
		return helm;
	}
	public void setHelm(int helm) {
		this.helm = helm;
	}
}
