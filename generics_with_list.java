//generic provides us the feature to store the element os the same data type


import java.util.*;//it will import all the thing in the java.util package contained
//list provide the feature of indexing the position of the elements added

public class generics_with_list {

    public static void main(String[] args) {

        List <Double>rupees=new ArrayList<>();// arraylist is inbuilt class which by default have collection implemented
        //here we are specifing that the data type is Double
        rupees.add(3.0);//here we can provide index number as well as value

        rupees.add(45.5);

        rupees.add(8.7);

        rupees.add(5.8);

        rupees.add(0,6.0);
        //list can hava any datatype value
        System.out.println(rupees);//by writing values inside it will print all the values


        //since the List supports the indexing we can use for loop

        //advanced for loop
        System.out.println("Running the advanced for loop ");
        //syntax for(Object o : rupees)
        for(Double k:rupees)
        {
            System.out.println(k);
        }




    }
}


