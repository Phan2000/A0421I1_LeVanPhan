package access_modifier_static.bai_tap.static_method;

public class StaticMethod {
    int rollno;
    String name;
    static String college = "CodeGym";
 
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }
 
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void main(String args[]) {
        StaticMethod s1 = new StaticMethod(111, "ABCDXYZ");
        StaticMethod s2 = new StaticMethod(222, "LMNCUEO");
 
        s1.display();
        s2.display();
    }
}