import java.util.ArrayList;
public class Dog extends Animal {
    private int killedCats;
    private ArrayList<Animal> killedAnimals = new ArrayList<>();

    public void fas (Animal animal) {
        killedCats++;
        System.out.println("Vseh porvu!!!! "+animal.getName()+" Killed");
        killedAnimals.add(animal);
        animal.setName(animal.getName()+" killed");
    }
    @Override
    public void voice (){
        System.out.println("Gav Gav");
    }
    public int getKilledCats() {
        return killedCats;
    }
    public ArrayList<Animal> getKilledAnimals() {
        return killedAnimals;
    }
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }

    public void setKilledCats(int killedCats) {
        this.killedCats = killedCats;
    }

    public void setKilledAnimals(ArrayList<Animal> killedAnimals) {
        this.killedAnimals = killedAnimals;
    }
}
