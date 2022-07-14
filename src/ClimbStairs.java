import java.util.ArrayList;

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
     * compute ways to climb nSteps steps
     * 
     * @param nSteps int how many steps
     * @return result int how many ways to climb
     */
    private static int countWays(int nSteps) {
        if (nSteps == 0)
            return 0;

        ArrayList<Integer> stairCase = new ArrayList<>(nSteps + 1);
        stairCase.add(0, 0);
        stairCase.add(1, 1);
        stairCase.add(2, 2);

        for (int i = 3; i <= nSteps; i++) {
            stairCase.add(i, stairCase.get(i - 1) + stairCase.get(i - 2));
        }

        return stairCase.get(nSteps);
    }

}
