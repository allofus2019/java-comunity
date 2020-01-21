package workshop2;

public class School implements Building{


    @Override
    public void buildWalls() {
        System.out.println("Building schools walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building schools roof");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building schools windows");
    }
}
