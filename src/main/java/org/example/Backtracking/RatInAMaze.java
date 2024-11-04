package org.example.Backtracking;

public class RatInAMaze {
    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1) {
            sol[x][y] = 1;

            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            // Backtrack
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static boolean solveMaze(int[][] maze) {
        int N = maze.length;
        int[][] sol = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;

    }

    public static void printSolution(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        solveMaze(maze);

    }
}
