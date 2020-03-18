import java.util.ArrayList;

public class Oop {
    public static void main(String[] args) {

        Animal cat = new Cat("Vaska");
        Animal dog = new Dog("Buch");
        Animal cat1 = new Cat("Murka");
        Dog dogS = new Dog();
        Animal[] animals = new Animal[]{cat, dog, cat1};
        Oop street = new Oop();
        street.fight(animals);
        System.out.println("result");
        ((Dog)dog).getKilledAnimals().forEach(a -> System.out.println(a.getName()));



    }

    void fight (Animal[] animals){

        for (Animal a: animals) {
            if (a instanceof Dog){
                for (Animal b: animals){
                    if(b instanceof Cat){
                        ((Dog) a).fas(b);
                    }
                }
            }
        }
    }
}
