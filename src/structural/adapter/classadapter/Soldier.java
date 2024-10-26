package structural.adapter.classadapter;

public class Soldier extends M16 {
	public void walk() {
		System.out.println("Soldier walking");
	}

	public void attack() {
		shoot();
	}

	@Override
	void shoot() {
		super.shoot();
		System.out.println("Soldier did");
	}
}
