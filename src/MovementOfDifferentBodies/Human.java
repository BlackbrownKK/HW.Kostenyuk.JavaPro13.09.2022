package MovementOfDifferentBodies;

public class Human implements ParticipantProperty {
    String nameOfParticipant;
    int limitHeightOfJumps = 2;
    double limitDistance = 1000;

    public Human(String nameOfParticipant) {
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
