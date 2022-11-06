package MovementOfDifferentBodies;

public class Robot implements ParticipantProperty {
    String nameOfParticipant;
    int limitHeightOfJumps = 3;
    double limitDistance = 500;

    public Robot(String nameOfParticipant) {
        this.nameOfParticipant = nameOfParticipant;
    }

    @Override
    public String nameId() {
        return nameOfParticipant;
    }

    @Override
    public int jumping() {
        return limitHeightOfJumps;
    }

    @Override
    public double runningMax() {
        return limitDistance;
    }
}
