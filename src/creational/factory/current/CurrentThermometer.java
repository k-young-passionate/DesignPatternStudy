package creational.factory.current;

import creational.factory.AbstractThermometer;

class CurrentThermometer implements AbstractThermometer {
	double temperature;

	CurrentThermometer(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String displayTemperature() {
		String temp = String.valueOf(temperature);
		System.out.printf("%.1f\n", temperature);
		return temp;
	}

	@Override
	public void heat() {
		this.temperature += 0.1;
	}

	@Override
	public void chill() {
		this.temperature -= 0.1;
	}
}
