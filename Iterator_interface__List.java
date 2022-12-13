
import java.util.*;//it will import all the thing in the java.util package contained
//list provide the feature of indexing the position of the elements added
public class Iterator_interface__List {
    public static void main(String[] args) {
        List rupees=new ArrayList();// arraylist is inbuilt class which by default have collection implemented
        rupees.add(3);//here we can provide index number as well as value
        rupees.add(45);
        rupees.add("Kunal Sharma");
        rupees.add(5.9);
        rupees.add(0,65);
       //list can hava any datatype value
        System.out.println(rupees);//by writing values inside it will print all the values


         //since the List supports the indexing we can use for loop

        //advanced for loop
        System.out.println("Running the advanced for loop ");
        //syntax for(Object o : rupees)
        for(Object k:rupees)
        {
            System.out.println(k);
        }




    }
}
