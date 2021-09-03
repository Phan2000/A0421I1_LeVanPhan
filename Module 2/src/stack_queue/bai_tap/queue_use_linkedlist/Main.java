package stack_queue.bai_tap.queue_use_linkedlist;

import stack_queue.bai_tap.queue_use_linkedlist.Queue_Use_Linkedlist.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue queue = new Queue();  
        queue.front = queue.rear =  null;  
                  
        Queue_Use_Linkedlist.enQueue(queue, 14);  
        Queue_Use_Linkedlist.enQueue(queue, 22);  
        Queue_Use_Linkedlist.enQueue(queue, 6);    
         
        Queue_Use_Linkedlist.displayQueue(queue);  
          
        System.out.printf(" Deleted value = %d", Queue_Use_Linkedlist.deQueue(queue));  
        System.out.printf(" Deleted value = %d", Queue_Use_Linkedlist.deQueue(queue));  
          
        Queue_Use_Linkedlist.displayQueue(queue);  
        
        Queue_Use_Linkedlist.enQueue(queue, 9);  
        Queue_Use_Linkedlist.enQueue(queue, 20);  
        Queue_Use_Linkedlist.displayQueue(queue);  
    }  
}
