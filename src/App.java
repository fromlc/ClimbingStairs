public class App {

    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 45; i++) {
            int waysToClimb = countClimbStairs(i);
            System.out.printf("%d steps, %d ways to climb them\n", i, waysToClimb);
        }
    }

    public static int countClimbStairs(int nSteps) {
        return rClimbStairs(0, nSteps);
    }

    private static int rClimbStairs(int startStep, int nSteps) {
        if (startStep > nSteps)
            return 0;
        if (startStep == nSteps)
            return 1;

        return rClimbStairs(startStep + 1, nSteps) + rClimbStairs(startStep + 2, nSteps);
    }
}
