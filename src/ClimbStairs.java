/**
 * @author https://www.enjoyalgorithms.com/blog/climbing-stairs-problem
 *
 *         sandbox for solutions to Climbing Stairs problem
 */
public class ClimbStairs {

    private static final int MAXSTEPS = 45;

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
     * compute ways to climb nSteps steps using static array
     * 
     * @param nSteps int how many steps, 1 <= nSteps <= 45
     * @return result int how many ways to climb
     */
    private static int countWays(int nSteps) {
        if (nSteps == 0)
            return 0;
        if (nSteps > MAXSTEPS)
            return -1;

        int[] stairCase = new int[MAXSTEPS + 1];
        stairCase[1] = 1;
        stairCase[2] = 2;

        for (int i = 3; i <= nSteps; i++) {
            stairCase[i] = stairCase[i - 1] + stairCase[i - 2];
        }

        return stairCase[nSteps];
    }

}
