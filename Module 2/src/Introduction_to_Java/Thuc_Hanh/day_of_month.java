package Introduction_to_Java.Thuc_Hanh;

import java.util.*;

public class day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your month : ");
        int month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("day of mont is : 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("day of month is : 30 day");
                break;
            case 2:
                System.out.print("Enter your year : ");
                int year = scanner.nextInt();
                boolean isLeapYear = false;
                if (year % 4 ==0 ){
                    if (year % 100 == 0){
                        if (year % 400 == 0){
                            isLeapYear = true;
                        }
                    }else {
                        isLeapYear = true;
                    }
                }
                if (isLeapYear){
                    System.out.print("day of month is: 29 day .");
                }else {
                    System.out.print("day of month is : 28 day .");
                }
        }
    }
}
