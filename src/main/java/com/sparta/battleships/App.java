package com.sparta.battleships;

public class App {
    
    public static int[][] gen_grid() {
        int rows = 5;
        int cols = 5;
        
        // 1. Declare and initialize a 5x5 2D array
        int[][] grid = new int[rows][cols];

        return grid;

    }

    public static void main(String[] args) {
        System.out.println(gen_grid());
    }

}
