package stack_queue.thuc_hanh.stack_use_linkedlist;

import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyGenericStack<T> {

    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<T>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
