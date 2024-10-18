package creational.factory.current;

import creational.factory.AbstractAirConditioner;
import creational.factory.AbstractFactory;
import creational.factory.AbstractThermometer;

public class CurrentFactory implements AbstractFactory {

	@Override
	public AbstractThermometer createThermometer() {
		return new CurrentThermometer(14.3);
	}

	@Override
	public AbstractAirConditioner createAirConditioner() {
		return new CurrentAirConditioner();
	}
}
