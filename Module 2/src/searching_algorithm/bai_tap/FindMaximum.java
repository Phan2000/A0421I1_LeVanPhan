package searching_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximum {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.print("Enter your String : \n");
        String string = scanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) { 

            LinkedList<Character> listCharacters = new LinkedList<>();
            listCharacters.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {               
                if (string.charAt(j) > listCharacters.getLast()) {
                    listCharacters.add(string.charAt(j));
                }
            }

            if (listCharacters.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(listCharacters);
            }
            listCharacters.clear();
        }

        for (Character character: maxString) { 
            System.out.print(character); 
        }
        System.out.println();
    }
}
