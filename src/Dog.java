import java.util.ArrayList;

public class Dog extends Animal {


    public void fas (Animal animal) {

        killedCats++;
        System.out.println("Vseh porvu!!!! "+animal.name+" Killed");
        list.add(animal);
        animal.name = "killed";
    }

    @Override
    public void voice (){
        System.out.println("GaVVVV");
    }

    int killedCats;
    ArrayList list = new ArrayList<Animal>();

    public int getKilledCats() {
        return killedCats;
    }

    public ArrayList getList() {
        return list;
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
}
