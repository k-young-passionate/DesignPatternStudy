package creational.factory.current;

import creational.factory.AbstractAirConditioner;
import creational.factory.AbstractThermometer;

class CurrentAirConditioner implements AbstractAirConditioner {

	final double MODERATE_TEMPERATURE = 20.5;
	final double THRESHOLD = 2.5;

	@Override
	public void runToModerateTemperature(AbstractThermometer thermometer) {
		while (true) {
			double currentTemperature = Double.parseDouble(thermometer.displayTemperature());

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
