import java.util.Scanner;
class Emplyoee{
    Private int empNo;
    Private String empName;
    Private int salary;
}
public class writeEmployee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the emplyoee num.");
        int no = sc.nextInt();
        System.out.println("Enter the emplyoee name");
        String name=sc.nextLine();
        System.out.println("Enter the emplyoee salary.");
        int salary=sc.nextInt();
        Emplyoee emp=new Emplyoee(no,name,salary);
        System.out.println()
        sc.close();


    }
}
