package creational.abstractfactory.factory.current;

import creational.abstractfactory.factory.AbstractAirConditioner;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.AbstractThermometer;

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
