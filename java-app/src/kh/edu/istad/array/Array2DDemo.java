package kh.edu.istad.array;

import java.util.Arrays;

public class Array2DDemo {
    public static void main(String[] args) {
        String[][] table = new String[2][3];
        table[0][0] = "Tola";
        table[0][1] = "Male";
        table[0][2] = "98.90";
        table[1][0] = "Kanha";
        table[1][1] = "Female";
        table[1][2] = "99";
        System.out.println(Arrays.deepToString(table));
    }
}
