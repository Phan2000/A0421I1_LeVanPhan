package list.bai_tap.arraylist_method;

import java.util.*;

public class MyList<E> {

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void clear(){
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
        System.out.println("List has delete");
    }

    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(2);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " don't correct");
        }

        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length * minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public Object get(int index){
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " don't correct");
        }
        return (Object)elements[index];
    }

    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element){
        return this.indexOf(element) > 0;
    }

    public MyList<E> clone(){
        MyList<E> tempList = new MyList<>();
        tempList.elements = Arrays.copyOf(this.elements,this.size);
        tempList.size = this.size;
        return tempList;
    }

    public Object remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        Object element = (Object)elements[index];
        for (int i = index; i < size - 1; i ++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
