package Array_in_Java.Thuc_Hanh;

import java.util.*;

public class find_in_array {
    public static void main(String[] args) {
        int i = 0;
        String[] nameStudents ={"Christian", "Michael", "Camila", "Sienna", "Tanya",
                                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name :");
        String name = scanner.nextLine();
        boolean flag = false;
        for (i = 0; i < nameStudents.length; i++){
            if (name.equals(nameStudents[i])) {
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.printf("The element in the array is at position : %d",i);
        }else {
            System.out.println("The element is not found ! ");
        }

    }
}
