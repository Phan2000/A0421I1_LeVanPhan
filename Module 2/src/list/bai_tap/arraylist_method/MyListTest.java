package list.bai_tap.arraylist_method;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Person> personList = new MyList<>();
        personList.add(new Person("Nam",20));
        personList.add(new Person("Tung",21));
        personList.add(new Person("Nghia",22));
        personList.add(new Person("Hoang",23));
        personList.add(new Person("Trung",24));

        System.out.println(personList.size());
        personList.clear();
        System.out.println(personList.size());
        System.out.println("=======================\n");
    }
}
