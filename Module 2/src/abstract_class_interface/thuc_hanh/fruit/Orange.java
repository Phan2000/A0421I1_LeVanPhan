package abstract_class_interface.thuc_hanh.fruit;

import abstract_class_interface.thuc_hanh.edible.Edible;

public class Orange extends Fruit {

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}