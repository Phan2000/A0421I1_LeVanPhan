package java_io.thuc_hanh.max_in_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String pathNameRead = "F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\thuc_hanh\\max_in_file\\numbers";
        String pathNameWrite = "F:\\A0421I1_LeVanPhan\\Module 2\\src\\java_io\\thuc_hanh\\max_in_file\\result";
        List<Integer> numbers = readAndWriteFile.readFile(pathNameRead);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(pathNameWrite, maxValue);
    }
}
