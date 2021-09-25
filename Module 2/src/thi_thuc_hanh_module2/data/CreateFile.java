package thi_thuc_hanh_module2.data;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void createFile(){
        File file1 = new File("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                "thi_thuc_hanh_module2\\data\\ImportProduct.csv");
        File file2 = new File("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                "thi_thuc_hanh_module2\\data\\ExportProduct.csv");
        try {
            if (file1.createNewFile()&&file2.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createFile();
    }
}
