public class Lion extends Animal{
    public Lion(){}
    public Lion(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("the lion is roaring");
    }

    @Override
    public void Action() {
        System.out.println("the lion is hunting");
    }

    @Override
    public void showInfo() {
        System.out.println("hien thi thong tin lion: ");
        super.showInfo();
    }

    @Override
    public void enterInfo() {
        System.out.println("enter lion info: ");
        super.enterInfo();
    }
}
