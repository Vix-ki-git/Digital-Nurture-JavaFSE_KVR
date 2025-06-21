public class Test {
    public static void main(String args[]) {
        Logger obj1 = Logger.getLogger();
        Logger obj2 = Logger.getLogger();

        if(obj1 == obj2) 
            System.out.println("Single Instance Used. Singleton design pattern observed.");
        else
            System.out.println("Not Sigle Instance Usage. Singleton design pattern not used.");

        obj1.log(1);
        obj2.log(2);
    }
}