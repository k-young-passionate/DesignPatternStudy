package creational.abstractfactory.factory;

public interface AbstractFactory {
	AbstractThermometer createThermometer();
	AbstractAirConditioner createAirConditioner();
}
