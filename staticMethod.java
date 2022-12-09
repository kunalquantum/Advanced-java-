//if we want to call the method of an interface conventionally we need to create object of implemented class
//however , java version 1.8 also provide us with the feature of static method inside the interface
//this static method created in the interface allows the calling directly the method without using any object
import java.util.*;
interface Static
{
    void flash();
    public static void display()  // STATIC METHOD INSIDE THE INTERFACE //
    {
        String name,surname,father;
        System.out.println("enter the name:");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("enter your father's name:");
        father = sc.nextLine();
        System.out.println("enter the surname:");
        surname=sc.nextLine();
        System.out.println( );
        System.out.println("your full name is: "+name+" "+surname+" "+father);

    }

}


public class staticMethod {
    public static void main(String[] args) {
        Static.display(); //syntax for the using static method is : InterfaceName.MethodName
    }
}
