package keThua;

public class buoi6 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        lion.eat();
        elephant.eat();


        Animal[] animals = new Animal[3];

        Animal lion1 = new Lion();
        animals[0] = lion;

        Animal elephant1 = new Elephant();
        animals[1] = elephant;

        Animal animal2 = new Monkey();
        animals[2] = animal2;

        for(Animal animal : animals){
            animal.makeSound();
        }
    }


}
