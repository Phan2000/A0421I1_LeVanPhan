package sort_algorithm.bai_tap;

public class InsertionSort {
      public static void main(String[] args) {
            double[] arrayNumbers = {3,1,9,-5.5,7,33,11,15,21};
            insertionSort(arrayNumbers); 
            for (double d : arrayNumbers) {
                  System.out.print(d + "--");
            }           
      }

      public static void insertionSort(double[] list){
            int pos;
            double temp;
            for (int i = 0; i < list.length; i++) {
                  temp = list[i];
                  pos = i;
                  while(pos > 0 && temp < list[pos-1]){
                        list[pos] = list[pos-1];
                        pos--;
                  }
                  list[pos] = temp; 
            }
      }
}
