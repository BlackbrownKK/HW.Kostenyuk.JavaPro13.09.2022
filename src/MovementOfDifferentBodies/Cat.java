package MovementOfDifferentBodies;

public class Cat implements ParticipantProperty {
    String nameOfParticipant;
    int limitHeightOfJumps = 1;
    double limitDistance = 80;

    public Cat(String nameOfParticipant) {
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

