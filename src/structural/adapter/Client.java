package structural.adapter;

// import structural.adapter.classadapter.Soldier;
import structural.adapter.objectadapter.M16;
import structural.adapter.objectadapter.Soldier;

public class Client {
	// Soldier soldier = new Soldier();
	Soldier soldier = new Soldier(new M16());

	public void run() {
		soldier.walk();
		soldier.attack();
	}
}
