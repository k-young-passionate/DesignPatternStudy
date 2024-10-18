package creational.factory.past;

import creational.factory.AbstractAirConditioner;
import creational.factory.AbstractThermometer;

class PastAirConditioner implements AbstractAirConditioner {

	final int MODERATE_TEMPERATURE = 20;
	final int THRESHOLD = 2;

	@Override
	public void runToModerateTemperature(AbstractThermometer thermometer) {
		while (true) {
			int currentTemperature = Integer.parseInt(thermometer.displayTemperature());

			if (Math.abs(currentTemperature - MODERATE_TEMPERATURE) <= THRESHOLD) {
				break;
			} else if (currentTemperature < MODERATE_TEMPERATURE) {
				thermometer.heat();
			} else {
				thermometer.chill();
			}
		}
	}
}
