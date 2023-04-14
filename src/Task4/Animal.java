package Task4;

public class Animal {
    public String type = "Пес";
    private int age = 3;
    protected String name = "Франко";

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal() {

    }
}

