package creational.client;

import creational.factory.AbstractAirConditioner;
import creational.factory.AbstractFactory;
import creational.factory.AbstractThermometer;
import creational.factory.current.CurrentFactory;
import creational.factory.past.PastFactory;

public class Client {
	// AbstractFactory factory = new PastFactory()
	AbstractFactory factory = new CurrentFactory();

	public void run() {
		AbstractAirConditioner airConditioner = factory.createAirConditioner();
		AbstractThermometer thermometer = factory.createThermometer();

		airConditioner.runToModerateTemperature(thermometer);
	}
}
