import java.util.ArrayList;
public class Dog extends Animal {
    int killedCats;
    ArrayList killedAnimals = new ArrayList<Animal>();

    public void fas (Animal animal) {
        killedCats++;
        System.out.println("Vseh porvu!!!! "+animal.getName()+" Killed");
        killedAnimals.add(animal);
        animal.setName("killed");
    }
    @Override
    public void voice (){
        System.out.println("Gav Gav");
    }
    public int getKilledCats() {
        return killedCats;
    }
    public ArrayList getKilledAnimals() {
        return killedAnimals;
    }
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }
}
