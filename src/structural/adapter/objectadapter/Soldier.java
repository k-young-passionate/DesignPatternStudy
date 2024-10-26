package structural.adapter.objectadapter;

public class Soldier {
	M16 m16;

	public Soldier(M16 m16) {
		this.m16 = m16;
	}

	public void walk() {
		System.out.println("Soldier walking");
	}

	public void attack() {
		m16.shoot();
	}

}
