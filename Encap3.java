class Student {
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>0){
            age=a;
        }else{
            System.out.println("Age must be positive");
        }
    }
    
}
public class Encap3 {
    
}
