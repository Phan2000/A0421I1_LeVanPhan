package java_io.bai_tap.copy_file_text;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        try {
            File file1 = new File("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io" +
                                               "\\bai_tap\\copy_file_text\\FileText1.txt");
            File file2 = new File("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io" +
                                               "\\bai_tap\\copy_file_text\\FileText2.txt");
            File file3 = new File("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\bai_tap\\Read_file_csv\\file.csv");
            if (file1.createNewFile()&&file2.createNewFile()&&file3.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
