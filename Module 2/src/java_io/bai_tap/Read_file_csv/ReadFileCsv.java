package java_io.bai_tap.Read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCsv {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader("F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io" +
                                                                           "\\bai_tap\\Read_file_csv\\File.csv"));
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
