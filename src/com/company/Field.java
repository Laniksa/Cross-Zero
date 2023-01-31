package com.company;

public class Field {
    private static int column = 3;
    private static int row = 3;
    private static char[][] ch = new char[row][column];


    public static char[][] mas() {

//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < column; j++ ){
//                ch[i][j] = '\u005f';
//            }
//            System.out.println(" ");
//        }
//        System.out.println("\n");
//        return ch;
//
//
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                ch[i][j] = '\u005f';
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        return ch;




//        String s1 = "First String";
//        char[][] charArray = s1.toCharArray();
//        for (char c : charArray) {
//            System.out.print(" " + c);
//        }

    }



}
