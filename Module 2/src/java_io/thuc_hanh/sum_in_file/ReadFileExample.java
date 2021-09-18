package java_io.thuc_hanh.sum_in_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
      private static void readFileText(String filePath) {
            try {
                  File file = new File(filePath);
                  if (!file.exists()){
                        throw new FileNotFoundException(); 
                  }
      
                  BufferedReader br = new BufferedReader(new FileReader(file));
                  String line;
                  int sum = 0;
                  while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        sum += Integer.parseInt(line);
                  }
                  br.close();
                  System.out.println("Sum = " + sum);
      
            } catch (Exception exception) {   
                  System.err.println("Fie not define !");
            }
      }

      public static void main(String[] args) {
            String filePath = "F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\thuc_hanh\\sum_in_file\\numbers.txt";
            readFileText(filePath);
      }
}