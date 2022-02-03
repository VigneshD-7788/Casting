package Casting;

//Parent class
class Parent2 {
    String name;

    void showMessage()
    {
        System.out.println("Parent method is called");
    }
}

// Child class
class Child2 extends Parent2 {
    int age;

    // Performing overriding
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }
}
public class Downcasting {
    public static void main(String[] args)
    {
        Parent2 p = new Child2();
        p.name = "Shubham";


        // Performing Downcasting Explicitly
        Child2 c = (Child2)p;

        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }

}
