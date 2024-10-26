package creational.abstractfactory.factory.past;

import creational.abstractfactory.factory.AbstractAirConditioner;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.AbstractThermometer;

public class PastFactory implements AbstractFactory {

	@Override
	public AbstractThermometer createThermometer() {
		return new PastThermometer(14);
	}

	@Override
	public AbstractAirConditioner createAirConditioner() {
		return new PastAirConditioner();
	}
}
