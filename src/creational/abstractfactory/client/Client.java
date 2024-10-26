package creational.abstractfactory.client;

import creational.abstractfactory.factory.AbstractAirConditioner;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.AbstractThermometer;
import creational.abstractfactory.factory.current.CurrentFactory;

public class Client {
	// AbstractFactory factory = new PastFactory()
	AbstractFactory factory = new CurrentFactory();

	public void run() {
		AbstractAirConditioner airConditioner = factory.createAirConditioner();
		AbstractThermometer thermometer = factory.createThermometer();

		airConditioner.runToModerateTemperature(thermometer);
	}
}
