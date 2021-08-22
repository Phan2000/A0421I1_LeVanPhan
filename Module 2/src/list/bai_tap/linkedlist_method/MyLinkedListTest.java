package list.bai_tap.linkedlist_method;

import list.bai_tap.arraylist_method.Person;

public class MyLinkedListTest {
    public static void main(String[] args) {
        
        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        Person person1 = new Person("Nam",20);
        Person person2 = new Person("Tung",21);
        Person person3 = new Person("Hoang",22);
        Person person4 = new Person("Nghia",23);

        myLinkedList.addFirst(person1);
        myLinkedList.addLast(person2);
        myLinkedList.addLast(person3);
        myLinkedList.addLast(person4);

        System.out.println("Pre-Clone :");

        for (int i = 0; i < myLinkedList.size(); i++) {
            Person persons = (Person) myLinkedList.get(i);
            System.out.println("Name is : "+persons.getName()+"\nAge: "+persons.getAge());
            
        }

        System.out.println("=====================");
        System.out.println("After-Clone :");

        MyLinkedList<Object> list = myLinkedList.clone();
        for (int i = 0; i < list.size(); i++) {
            Person persons = (Person) list.get(i);
            System.out.println("Name is : "+persons.getName()+"\nAge: "+persons.getAge());
        }
    }
}
