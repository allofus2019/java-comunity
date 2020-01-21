package workshop2;

import Zoo.Animal;

public class Hospital extends Animal implements Building {

	public Hospital(String nume, int nrConserve) {
		super(nume, nrConserve);
	}

	public void action(int pasi){
		System.out.println("Cainele a facut "+pasi+" pasi");
	}
	
	@Override
	public void buildWalls() {
		System.out.println("Building hospital walls");
	}

	@Override
	public void buildRoof() {
		System.out.println("Building hospital roof");
	}

	@Override
	public void buildWindows() {
		System.out.println("Building hospital windows");
	}
}
