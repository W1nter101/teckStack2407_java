import java.util.Scanner;

public class student {
    private String name;
    private int age;
    private String id;

    public student() {}
    public student(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
