class Student{
    private String name;//private-> hidden from outside

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class TestEncapsulation {
    public static void main(String[] args){
        Student s=new Student();
        s.setName("Mehsehwar");//setting value
        System.out.println(s.getName());//getting value
    }
}
