


public class Oop {
    public static void main(String[] args) {

        Animal cat = new Cat("Vaska");
        Animal dog = new Dog("Buch");
        Animal cat1 = new Cat("Murka");
        Dog dogS = new Dog();

        Animal[] animals = new Animal[]{cat, dog, cat1};

        Oop street = new Oop();
        street.fight(animals);
 //       (Dog)dog.

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
