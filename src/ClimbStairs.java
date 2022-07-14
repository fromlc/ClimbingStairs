/**
 * @author https://www.enjoyalgorithms.com/blog/climbing-stairs-problem
 *
 *         sandbox for solutions to Climbing Stairs problem
 */
public class ClimbStairs {

    /**
     * Constructor won't get called - why not?
     */
    public ClimbStairs() {
        System.out.println("ClimbStairs constructor");
    }

    /**
     * Entry point
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 45; i++) {
            int waysToClimb = countWays(i);
            System.out.printf("%d steps, %d ways to climb them\n", i, waysToClimb);
        }
    }

    /**
     * call recursive method
     * 
     * @param nSteps int how many steps
     * @return result int how many ways to climb
     */
    public static int countWays(int nSteps) {
        return rCountWays(0, nSteps);
    }

    /**
     * recursive: compute ways to climb nSteps steps
     * 
     * @param nSteps int
     * @param startStep int start step for climb
     * @return result int how many ways to climb
     */
    private static int rCountWays(int startStep, int nSteps) {
        if (startStep > nSteps)
            return 0;
        if (startStep == nSteps)
            return 1;

        return rCountWays(startStep + 1, nSteps) + rCountWays(startStep + 2, nSteps);
    }
}
