public class Elephant extends Animal{
    public Elephant() {}
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("the elephant is trumpeting");
    }

    @Override
    public void Action() {
        System.out.println("the elephant is spraying water");
    }

    @Override
    public void showInfo() {
        System.out.println("elephant info: ");
        super.showInfo();
    }

    @Override
    public void enterInfo() {
        System.out.println("enter elephant info: ");
        super.enterInfo();
    }
}
