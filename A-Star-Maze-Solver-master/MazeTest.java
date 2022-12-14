import java.util.Arrays;


public class MazeTest {

    public static void main(String[] args){
        System.out.println("Start");

        int[] start = {0,0};
        int[] goal = {9,4};
        int[][] maze =
                {
                        {0,1,0,0,0,0,0,0,1,0},
                        {0,1,0,1,0,1,0,0,1,0},
                        {0,0,0,0,0,0,1,0,1,0},
                        {0,1,0,1,0,1,0,0,1,0},
                        {1,0,0,0,0,1,0,0,1,0},
                        {1,0,0,1,0,1,0,0,1,0},
                        {0,0,0,1,1,0,1,0,1,0},
                        {0,1,0,0,0,0,1,0,0,0}
                };
        MazeSolver solver = new MazeSolver(start, goal, maze);
        long startT = System.currentTimeMillis();
        solver.solve();
        System.out.println(System.currentTimeMillis()-startT);

        char[][] annotatedMaze = solver.annotatedMaze();
        for (char[] array : annotatedMaze) {
            System.out.println(Arrays.toString(array));
        }
        if(!solver.hasAccurateSolution()) System.out.println("No Solution");
    }
}
