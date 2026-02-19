public class Exception {
    static void fun()
    {
        try{
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e)
        system.out.println("Caught in fun().");
        throw e; 
    }
}
public static void main(String[] args) {
    try{
        fun();
    }
    catch(NullPointerException e){
    System.out.println("Caught in main().");
    }
}