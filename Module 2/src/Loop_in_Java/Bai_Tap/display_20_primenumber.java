package loop_in_java.bai_tap;

import java.util.*;

public class display_20_primenumber {
    public static void main(String[] args) {
            int n;
            boolean flag = true;
            int num = 2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first n primes :");
            n = scanner.nextInt();

            for ( int i = 0 ; i <= n ;  )
            {
                for ( int j = 2 ; j < i-1 ; j++ )
                {
                    if ( num % j == 0 )
                    {
                        flag = false;
                        break;
                    }
                }
                if ( flag )
                {
                    System.out.println(num + " is Prime number");
                    i++;
                }
                flag = true;
                num++;
            }
    }
}
