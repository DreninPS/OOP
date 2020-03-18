



public class Cat extends Animal{

    @Override
    public void voice (){
        System.out.println("Murrrrr");
    }

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}
