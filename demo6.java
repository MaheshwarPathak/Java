public class demo6 {
    public static void main(String[] args){
        System.out.println("Hello");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);//name of the EXCEPTION description
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());//get description only
            

        }
        System.out.println("Hello, How are you.");
    }
}
