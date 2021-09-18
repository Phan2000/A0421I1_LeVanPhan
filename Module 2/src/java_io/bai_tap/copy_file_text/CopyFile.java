package java_io.bai_tap.copy_file_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
         try {
             inputStream = new FileInputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\bai_tap\\copy_file_text\\FileText1.txt");
             outputStream = new FileOutputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\bai_tap\\copy_file_text\\FileText2.txt");

             int length;
             byte[] buffer = new byte[256];
             while ((length = inputStream.read(buffer))>0){
                 outputStream.write(buffer, 0, length);
             }
             System.out.println("File was copy");
         }catch (IOException e){
             e.printStackTrace();
         }finally {
             try {
                 assert inputStream != null;
                 inputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             try {
                 assert outputStream != null;
                 outputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
    }
}
