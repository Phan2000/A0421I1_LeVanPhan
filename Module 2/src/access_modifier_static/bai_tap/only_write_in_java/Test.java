package access_modifier_static.bai_tap.only_write_in_java;

public class Test {

	public static void main(String[] args) {
		
		Students nam = new Students();
		nam.setName("Nam");
		nam.setClasses("A0421I1");
		System.out.println("Name is : " + nam.getName());
		System.out.println("Class is : " + nam.getClasses());
	}
}