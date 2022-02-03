package Casting;
abstract class Person{
    abstract void eat();
}
public class Anonymousinner {
    public static void main(String []args){
        Person p=new Person() {
            @Override
            void eat() {
                System.out.println("Tasty fruits");
            }
        };
        p.eat();
    }

}
