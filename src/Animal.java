import java.util.ArrayList;

public abstract class Animal {
    String name;
    protected int age;
    int hp = 50;
    int attack = 15;

    ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    abstract void sound();

    abstract void punch(Animal enemy);
}
