package MovementOfDifferentBodies;

public class App {
    static double resultDistance;

    public static void main(String[] args) {

        ParticipantProperty[] bodiesAraysName = {new Cat("Matilda"), new Human("Vitalik"),
                new Robot("T2")};

        TrackProperties[] track = {
                new Track(150),
                new Wall(1),
                new Track(50),
                new Wall(2),
                new Track(50),
                new Wall(2),
                new Track(500),
                new Wall(3),
                new Track(50)
        };

        for (ParticipantProperty player : bodiesAraysName) {
            resultDistance = 0;
            for (TrackProperties runTry : track) {
                while (player.jumping() >= runTry.getWallSise() && player.runningMax() >= resultDistance + runTry.getRoadSise()) {

                    resultDistance = runTry.getRoadSise() + resultDistance;

                    System.out.println(player.getClass().getSimpleName() + " " + player.nameId() + " " +
                            "jumped over the wall" + " " + runTry.getWallSise() + "m and total ran " +
                            Rounder.roundValue(resultDistance) + "m");
                    break;
                }
            }
        }
    }
}
