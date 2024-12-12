package keThua;

public class Monkey extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering");
    }

    @Override
    public void Action() {
        System.out.println("the lion is climbing tree");
    }

    @Override
    public void showInfo() {
        System.out.println("Monkey Info: ");
        super.showInfo();
    }
}
