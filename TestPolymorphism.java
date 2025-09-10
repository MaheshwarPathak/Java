class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Animal{
    void sound(){
        System.out.println("Some sound");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class TestPolymorphism {
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));

        Animal a=new Cat();
        a.sound();
    }
}
