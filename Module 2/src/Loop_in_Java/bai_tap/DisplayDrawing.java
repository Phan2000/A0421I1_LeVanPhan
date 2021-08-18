package loop_in_java.bai_tap;

import java.util.*;

public class DisplayDrawing {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            for (int j = 0; j<6;j++){
                System.out.print(" * ");//In hình chữ nhật;
            }
            System.out.println("");
        }

        for (int i = 0; i <= 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");//In hình tam giác vuông;
            }
            System.out.println("");
        }

        for (int i = 4; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print("*");//In tam giác vuông ngược;
            }
            System.out.println("");
        }
    }
}
