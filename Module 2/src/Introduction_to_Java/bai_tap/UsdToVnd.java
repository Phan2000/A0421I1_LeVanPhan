package introduction_to_java.bai_tap;

import java.util.*;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money : ");
        float usd = scanner.nextFloat();
        float vnd = usd*25000;
        System.out.printf("Số tiền cuẩ bạn là : %f ",vnd);
    }
}
