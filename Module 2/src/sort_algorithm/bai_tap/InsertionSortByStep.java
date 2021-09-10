package sort_algorithm.bai_tap;

public class InsertionSortByStep {
      public static void main(String[] args) {
            double[] arrayNumbers = {3,1,9,-5.5,7,33,11,15,21};
            System.out.println("Begin sort processing...");
            insertionSortByStep(arrayNumbers); 
            for (double d : arrayNumbers) {
                  System.out.print(d + "--");
            }           
      }

      public static void insertionSortByStep(double[] list){
            int n = list.length;
            for (int i = 1; i < n; ++i) {
                  Double key = list[i];
                  int j = i - 1;
            // Di chuyển các phần tử của list [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
                  while (j >= 0 && list[j] > key) {
                        list[j + 1] = list[j];
                        System.out.printf("\nlist[%d] = %f  \nlist[%d] = %f",j+1,list[j+1],j,list[j]);
                        System.out.print("\nj = " + j);
                        j = j - 1;
                  }
                  list[j + 1] = key;
                  System.out.printf("\nj = -1 or list[j] < key ==> list[%d] = %f",j+1,key);
            }   
      }
}
