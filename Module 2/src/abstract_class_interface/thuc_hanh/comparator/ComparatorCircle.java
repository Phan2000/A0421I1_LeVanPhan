package abstract_class_interface.thuc_hanh.comparator;

import abstract_class_interface.thuc_hanh.geometry.Circle;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        }
        else if (o1.getRadius() < o2.getRadius()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
