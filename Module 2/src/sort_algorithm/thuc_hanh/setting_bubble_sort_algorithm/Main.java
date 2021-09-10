package sort_algorithm.thuc_hanh.setting_bubble_sort_algorithm;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,15,5,21,25,45,99,27,13,19};
        BubbleSort.bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
   }
}
