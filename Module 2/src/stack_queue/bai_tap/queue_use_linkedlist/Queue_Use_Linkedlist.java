package stack_queue.bai_tap.queue_use_linkedlist;

public class Queue_Use_Linkedlist {
    public static class Node{
        int data;
        Node link;
    }

    public static class Queue{
        Node front;
        Node rear;
    }

    public static void enQueue(Queue queue, int value){
        Node newNode = new Node();
        newNode.data = value;
        if(queue.front == null){
            queue.front = newNode;
        }else{
            queue.rear.link = newNode;
        }
        queue.rear = newNode;
        queue.rear.link = queue.front;
    }

    public static int deQueue(Queue queue){

        if (queue.front ==  null)  {  
            System.out.printf ("queueeue is empty");  
            return Integer.MIN_VALUE;  
        }  
        
        int value;  
        if (queue.front == queue.rear){  
            value = queue.front .data;  
            queue.front =  null;  
            queue.rear =  null;  
        }  
        else {  
            Node newNode = queue.front;  
            value = newNode.data;  
            queue.front = queue.front.link;  
            queue.rear.link= queue.front;  
        }  
    
        return value ;  
    }

    public static void displayQueue(Queue queue){  
        Node  temp = queue.front;  
        System.out.printf("Elements in Circular Qeueue are: ");  
        while (temp .link != queue .front)  
        {  
            System.out.printf("%d ", temp .data);  
            temp = temp .link;  
        }  
        System.out.printf("%d", temp .data);  
    }  

}
