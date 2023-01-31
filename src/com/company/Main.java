package com.company;

public class Main {
    private static int row = 3;
    private static int column = 3;
    private static String str = " _ ";

    private static String[][] ch = new String[row][column];


    public static void main(String[] args) {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                System.out.print(ch[i][j] = str);
            }
            System.out.println(" ");
        }
    }
}
