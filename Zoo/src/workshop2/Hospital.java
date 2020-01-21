package workshop2;

public class Hospital implements Building {
    @Override
    public void buildWalls() {
        System.out.println("Building hospital walls  ");
    }

    @Override
    public void buildRoofs() {
        System.out.println("Building hospital roof");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building hospital windows");
    }
}
