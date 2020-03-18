public class Animal {
    private String name;
    public void voice () {
        System.out.println("Voice");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //@Override

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
}
