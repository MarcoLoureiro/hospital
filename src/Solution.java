import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            Boolean verificar = scanner.hasNext();
            if(verificar){

            }

        }


    }

    public static void verificarDataType(Long entrada) {

        System.out.println(entrada + " can be fitted in:");
        if (entrada >= Byte.MIN_VALUE && entrada <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
        if (entrada >= Short.MIN_VALUE && entrada <= Short.MAX_VALUE) {

        }
        if (entrada >= Integer.MIN_VALUE && entrada <= Integer.MAX_VALUE) {
            System.out.println("* integer");
        }
        if (entrada >= Long.MIN_VALUE && entrada <= Long.MAX_VALUE) {
            System.out.println("* long");
        }
    }

}