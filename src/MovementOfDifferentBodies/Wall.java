package MovementOfDifferentBodies;

public class Wall implements TrackProperties {

double wallHeight;

    public Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public double getWallSise() {
        return wallHeight;
    }

}
