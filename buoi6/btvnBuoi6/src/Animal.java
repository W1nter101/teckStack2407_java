import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("animal is eating");
    }
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public abstract void makeSound();
    public abstract void Action();
    public void enterInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Age: ");
        this.age = sc.nextInt();

    }
}
