package MovementOfDifferentBodies;

public interface TrackProperties {

    double wallSise = 0;
    double roadSise = 0;

    default double getWallSise() {
        return wallSise;
    }

    default double getRoadSise() {
        return roadSise;
    }

}