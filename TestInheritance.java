class Person{
    String name="Maheshwar Pathak";
}
class Employee extends Person{
    String company="TCS";
}
public class TestInheritance {
    public  static void main(String[] args){
        Employee e=new Employee();
        System.out.println(e.name+" works at "+e.company);
    }
}
