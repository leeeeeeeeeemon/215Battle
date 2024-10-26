import java.util.Random;

public class Cat extends Animal {
    {
        this.name = "Koshak";
        this.age = 3;
    }

    void setAge(int age){
        if(age >= 0 && age < 40){
            this.age = age;
        }
    }


    void disployInfo(){
        System.out.println(name + " " + age);
    }

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    Cat(String name){
        this.name = name;
        this.age = 7;
    }

    Cat(){

    }

    @Override
    void punch(Animal enemy) {

        Random rnd = new Random();
        int punch = attack + rnd.nextInt(-5,5);
        enemy.hp -= punch;
        System.out.println(name + " Ударил палкой " + enemy.name + " хп осталось: " + enemy.hp);
    }
}
