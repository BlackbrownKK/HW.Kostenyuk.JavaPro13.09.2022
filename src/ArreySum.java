
import java.util.Arrays;

public class ArreySum {

    public static void main(String[] args) {
        int[] runningSum = new int[]{3,1,2,10,1};
        for (int i = 1; i < runningSum.length; i++) {
            runningSum[i] = runningSum[i] + runningSum[i - 1];
        }
        System.out.println("Running sum is: " + Arrays.toString(runningSum) + ".");
    }
}
