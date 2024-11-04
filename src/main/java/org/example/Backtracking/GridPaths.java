package org.example.Backtracking;

public class GridPaths {
    public static int countPaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }

    public static void main(String[] args)
    {
        int m = 3, n = 3;
        System.out.println(countPaths(m, n));
    }
}
