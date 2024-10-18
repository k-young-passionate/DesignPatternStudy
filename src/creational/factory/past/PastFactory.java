package creational.factory.past;

import creational.factory.AbstractAirConditioner;
import creational.factory.AbstractFactory;
import creational.factory.AbstractThermometer;

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
