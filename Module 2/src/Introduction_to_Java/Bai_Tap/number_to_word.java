package introduction_to_java.bai_tap;

import java.util.Scanner;

public class number_to_word {
    public void pw(int n, String str)
    {
        String[] one = {
                " ", " one", " two", " three", " four", " five", " six", " seven",
                " eight", " Nine", " ten", " eleven", " twelve", " thirteen",
                " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
                " nineteen"
        };
        String[] ten = { " ", " ", " twenty", " thirty", " forty", " fifty",
                " sixty", "seventy", " eighty", " ninety"
        };
        if (n > 19) {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        }
        else {
            System.out.print(one[n]);
        }
        if (n > 0)
            System.out.print(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        number_to_word numberToWord = new number_to_word();
        System.out.print("After conversion number in words is :");
        numberToWord.pw(((number / 100) % 10), " hundred");
        numberToWord.pw((number % 100), " ");
    }
}
