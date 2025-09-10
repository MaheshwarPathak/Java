class Parent{
    public void func(){
        System.out.println("parent.func()");
    }
    public void func(int a){
        System.out.println("parent.func(int): "+a);
    }
}
class  Child extends Parent{
    public void func(int a){
        System.out.println("Child.func(int):"+a);
    }
}
public class Main {
    public static void main(String[] args){
        Parent parent=new Parent();
        Child child=new Child();
        
        Parent polymorphicObj=new Child();
        parent.func(10);
        child.func(20);

        polymorphicObj.func(30);
    }
}
