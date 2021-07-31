package access_modifier_static.bai_tap.only_write_in_java;

public class Students {
    private String name = "Le Van Phan";
    private String classes = "A0421I1";

    Students(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

	public String getClasses() {
        return  classes;
    }
}