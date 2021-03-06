package abstract_class_interface.thuc_hanh.animal_interface_edible;

import abstract_class_interface.thuc_hanh.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat(){
        return "Could be fried";
    }
}