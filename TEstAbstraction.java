abstract class Animal{
    abstract void sound();//only idea, no body
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks.");
    }
}
public class TEstAbstraction {
    public static void main(String[] args){
        Animal a=new Dog();//Abstraction in action
        a.sound();
    }
}
