package creational.factory.past;

import creational.factory.AbstractThermometer;

class PastThermometer implements AbstractThermometer {
	int temperature;

	PastThermometer(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String displayTemperature() {
		String temp = String.valueOf(this.temperature);
		System.out.println(temp);
		return temp;
	}

	@Override
	public void heat() {
		this.temperature++;
	}

	@Override
	public void chill() {
		this.temperature--;
	}
}
