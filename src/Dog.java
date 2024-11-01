import java.util.Random;

public class Dog extends Animal
{
    {
        this.age = 24;
        this.name = "Cartman";
        this.attack = 15;
    }

    @Override
    void punch(Animal enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-12, 7);
        enemy.hp -= punch;
        System.out.println(name + " кастанул заклинание с силой "+ punch + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
    }
}
