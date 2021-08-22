package list.bai_tap.linkedlist_method;

public class MyLinkedList<E> {
    
    private MyNode head;
    private int numNodes = 0;

    class MyNode {
        MyNode next;
        Object data;
    
        public MyNode(Object data) {
            this.data = data;
        }
    
        public Object getData() {
            return this.data;
        }
    }
    
    public MyLinkedList() {
    }

    public void addFirst(E element){
        MyNode insert = head;
        head = new MyNode(element);
        head.next = insert;
        numNodes++;
    }

    public void addLast(E element){
        MyNode insert = head;
        while (insert.next != null){
            insert = insert.next;
        }
        insert.next = new MyNode(element);
        numNodes++;
    }

    public void add(int index, E element){
        if (index < 0 || index >= numNodes) {
            throw new ArrayIndexOutOfBoundsException();
        }

        MyNode node = head;
        for(int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        MyNode insert = new MyNode(element);
        insert.next = node.next;
        node.next = insert;
        numNodes++;
    }

    public Object get(int index){
        MyNode element = head;
        for (int i = 0; i < index; i++){
            element = element.next;
        }
        return element.data;
    }

    public int size(){
        return numNodes;
    }

    public Object remove(int index){
        if (index < 0 || index >= numNodes) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            Object element = (Object)head.data;
            head = head.next;
            numNodes--;
            return element;
        }

        MyNode node = head;
                for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Object element = (Object) node.next.data;
        node.next = node.next.next;
        numNodes--;
        return element;
    }
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else{
            MyNode obj = head;
            while (obj.next != null){
                if (obj.next.data.equals(element)){
                    obj.next = obj.next.next;
                    numNodes--;
                    return true;
                }
                obj = obj.next;
            }
        }
        return false;
    }

    public MyLinkedList<Object> clone(){
        if (numNodes == 0){
            throw new NullPointerException("LinkedList is null");
        }
        MyLinkedList<Object> newMyLinkedList = new MyLinkedList<>();
        MyNode element = head;
        newMyLinkedList.addFirst((Object) element.data);

        element = element.next;
        while (element != null){
            newMyLinkedList.addLast((Object)element.data);
            element = element.next;
        }
        return newMyLinkedList;
    }

    public boolean contains(E element){
        MyNode temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        MyNode temp = head;
        for (int i = 0; i < numNodes; i++){
            if (temp.getData().equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
