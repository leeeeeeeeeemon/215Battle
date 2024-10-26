import java.util.Random;

public class Dog extends Animal
{
    {
        this.age = 24;
        this.name = "Собака";
        this.attack = 20;
    }

    @Override
    void punch(Animal enemy) {
        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-10,5);
        enemy.hp -= punch;
        System.out.println(name + " кинул камень с силой " + punch + " в " + enemy.name + " хп осталось: " + enemy.hp);
    }
}
