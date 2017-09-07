package com.company;

public class GameMap {

//    Robot R
//    Mine M
//    Defects D

    public static int r_row;
    public static int r_col;

    public static char[][] grid = {
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'}
    };


    public static void show(){
        for(char[] row: grid){
            for(char col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int geoCord(){
        return (int)(Math.random()*(grid.length));
    }

    public static void init(){
        r_row = geoCord();
        r_col = geoCord();
        grid[r_row][r_col] = 'R';
    }
    public static void placeMine(){
        int can = 0;
        while (true){
            int r1 = geoCord();
            int c1 = geoCord();
            if(grid[r1][c1] == '.' ){
                grid[r1][c1] = 'M';
                can++;
            }
            if(can == 20){
                break;
            }
        }
    }
    public static void placedefects(){
        int can = 0;
        while (true){
            int r1 = geoCord();
            int c1 = geoCord();
            if(grid[r1][c1] == '.'){
                grid[r1][c1] = 'D';
                can++;
            }
            if(can == 20){
                break;
            }
        }
    }

    public static void moveRight(){
        if (r_col<9){
            grid[r_row][r_col] = '.';
            grid[r_row][++r_col] = 'R';
        }else{
            System.out.println("can t move to the right");
        }

    }
    public static void moveLeft(){
        if (r_col!=0){
            grid[r_row][r_col] = '.';
            grid[r_row][--r_col] = 'R';
        }else{
            System.out.println("can t move to the left");
        }

    }
    public static void moveUp(){
        if (r_row!=0){
            grid[r_row][r_col] = '.';
            grid[--r_row][r_col] = 'R';
        }else{
            System.out.println("can t move up");
        }

    }
    public static void moveDown(){
        if (r_row<9){
            grid[r_row][r_col] = '.';
            grid[++r_row][r_col] = 'R';
        }else{
            System.out.println("can t move to the down");
        }

    }

}
//gata am terminat