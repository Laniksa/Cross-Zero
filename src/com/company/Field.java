package com.company;

import java.util.Scanner;

public class Field {
    private static int column = 3;
    private static int row = 3;
    private static char[][] ch = new char[row][column];
    private static char sim = '\u005f';
    Scanner scan = new Scanner(System.in);


    public static char[][] mas() {

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                System.out.print(ch[i][j] = sim);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        return ch;
    }

    public static char[][] changeMas(Scanner scan){
        return ch;
    }

}
