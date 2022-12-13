
import java.util.*;//it will import all the thing in the java.util package contained

public class Iterator_interface_collection {
    public static void main(String[] args) {
        Collection values=new ArrayList();// arraylist is inbuilt class which by default have collection implemented
        values.add(23);
        values.add(45);
        values.add(12);
        values.add(56);

        System.out.println(values);//by writing values inside it will print all the values


        Iterator it = values.iterator();

        //using while loop
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("out of while loop" );

        //
        System.out.println("boolean answer of the next value :"it.hasNext());

        //
        System.out.println("the hascode :"+it.hashCode());



    }
}
