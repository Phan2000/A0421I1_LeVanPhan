package opp_in_java.bai_tap.build_class_stop_watch;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumber = new int[100000];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        Arrays.sort(arrayNumber);
        stopwatch.stop();
        System.out.print("Millisecond : " + stopwatch.getElapsedTime() + "\n");
        stopwatch.start();
        System.out.print("1\n");
        stopwatch.stop();
        System.out.print("Millisecond : " + stopwatch.getElapsedTime());
    }
}