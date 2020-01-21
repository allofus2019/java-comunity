package workshop2;

public class School implements Building {

	@Override
	public void buildWalls() {
		System.out.println("Building school walls");
	}

	@Override
	public void buildRoof() {
		System.out.println("Building school roof");
	}

	@Override
	public void buildWindows() {
		System.out.println("Building school windows");
	}
}
